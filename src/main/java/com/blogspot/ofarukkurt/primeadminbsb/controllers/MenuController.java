package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.enums.MenuType;
import com.blogspot.ofarukkurt.primeadminbsb.models.Menu;
import com.blogspot.ofarukkurt.primeadminbsb.services.MenuFacade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT
 * @mail kurtomerfaruk@gmail.com
 * @blog : https://ofarukkurt.blogspot.com.tr/
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

    private String pageLink;
    private String pageName;

    private String searhText;

    public MenuController() {
        // Inform the Abstract parent controller of the concrete Menu Entity
        super(Menu.class);
        iconList = new ArrayList<>();
        String str = "data_usage,search,person_pin,directions_car,art_track,apps,poll,menu,"
                + "credit_card,attach_money,insert_drive_file,public,insert_photo,contacts";
        iconList.addAll(Arrays.asList(str.split("\\s*,\\s*")));
        Collections.sort(iconList);
        pageLink = "blankPage";
        pageName = "Main Page";
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
         if (menuList == null) {
            menuList = menuService.findAll();
        }
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getSearhText() {
        return searhText;
    }

    public void setSearhText(String searhText) {
        this.searhText = searhText;
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
        menuList = menuService.findAll();
    }

    public void setPage(String link, String name) {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, Object> map = context.getViewRoot().getViewMap();
        List<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (!key.equals("menuController")) {
                list.add(key);
            }
        }

        if (list != null && !list.isEmpty()) {
            for (String get : list) {
                map.remove(get);
            }
        }
        setPageLink(link);
        setPageName(name);
    }

    public void menuSearchValueChange(ValueChangeEvent event) {
        if (event.getOldValue() == null || !event.getOldValue().equals(event.getNewValue())) {
            menuList = menuService.searchMenuList(event.getNewValue().toString());
        }

        for (int i = 0; i < menuList.size(); i++) {
            Menu get = menuList.get(i);
            if (get.getTopMenuId() != null) {
                Menu topMenu = menuService.getTopMenu(get.getTopMenuId());

                if (topMenu != null) {
                    if (!menuList.contains(topMenu)) {
                        menuList.add(topMenu);
                    }
                }
            }
        }
    }

}
