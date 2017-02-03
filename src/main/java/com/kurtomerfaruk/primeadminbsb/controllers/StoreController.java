package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Store;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "storeController")
@ViewScoped
public class StoreController extends AbstractController<Store> {

    public StoreController() {
        // Inform the Abstract parent controller of the concrete Store Entity
        super(Store.class);
    }

}
