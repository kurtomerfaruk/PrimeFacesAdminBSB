package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.enums.MenuType;
import com.kurtomerfaruk.primeadminbsb.models.Menu;
import com.kurtomerfaruk.primeadminbsb.services.MenuFacade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * @Created on date 27.01.2017 23:11:05
 */
@Named(value = "menuController")
@ViewScoped
public class MenuController extends AbstractController<Menu> {

    private static final long serialVersionUID = -3404882713320828831L;

    @EJB
    private MenuFacade menuService;

    private MenuType[] menuTypes;

    private List<String> iconList;
    private List<Menu> menuList;

    public MenuController() {
        // Inform the Abstract parent controller of the concrete Menu Entity
        super(Menu.class);
        iconList = new ArrayList<>();
        String str = "data_usage,search,person_pin,directions_car,art_track,apps,poll,menu,"
                + "credit_card,attach_money,insert_drive_file,public,insert_photo,contacts";
        iconList.addAll(Arrays.asList(str.split("\\s*,\\s*")));
        Collections.sort(iconList);
    }

    public MenuType[] getMenuTypes() {
        return MenuType.values();
    }

    public void setMenuTypes(MenuType[] menuTypes) {
        this.menuTypes = menuTypes;
    }

    public List<String> getIconList() {
        return iconList;
    }

    public void setIconList(List<String> iconList) {
        this.iconList = iconList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<Menu> topMenuList() {
        return menuService.getTopMenuList();
    }

    public List<String> completeIcon(String query) {
        List<String> filteredIcons = new ArrayList<String>();

        for (String icon : iconList) {
            if (icon.toLowerCase().contains(query)) {
                filteredIcons.add(icon);
            }
        }

        return filteredIcons;
    }

    @PostConstruct
    public void init() {
        if (menuList == null) {
            menuList = new ArrayList<>();
        }
        menuList=menuService.findAll();
    }

}
