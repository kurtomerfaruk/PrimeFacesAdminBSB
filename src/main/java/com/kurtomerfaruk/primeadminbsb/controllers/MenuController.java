package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Menu;
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

    public MenuController() {
        // Inform the Abstract parent controller of the concrete Menu Entity
        super(Menu.class);
    }

}
