package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.UserMenu;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * @Created on date 27.01.2017 23:11:05
 */
@Named(value = "userMenuController")
@ViewScoped
public class UserMenuController extends AbstractController<UserMenu> {

    private static final long serialVersionUID = -4444971550065198040L;

    public UserMenuController() {
        // Inform the Abstract parent controller of the concrete UserMenu Entity
        super(UserMenu.class);
    }

}
