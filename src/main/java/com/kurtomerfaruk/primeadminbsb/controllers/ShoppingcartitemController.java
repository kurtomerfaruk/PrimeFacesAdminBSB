package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Shoppingcartitem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "shoppingcartitemController")
@ViewScoped
public class ShoppingcartitemController extends AbstractController<Shoppingcartitem> {
    private static final long serialVersionUID = -8905053342206169616L;

    public ShoppingcartitemController() {
        // Inform the Abstract parent controller of the concrete Shoppingcartitem Entity
        super(Shoppingcartitem.class);
    }

}
