package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Store;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "storeController")
@ViewScoped
public class StoreController extends AbstractController<Store> {
    private static final long serialVersionUID = -2640668279768970317L;

    public StoreController() {
        // Inform the Abstract parent controller of the concrete Store Entity
        super(Store.class);
    }

}
