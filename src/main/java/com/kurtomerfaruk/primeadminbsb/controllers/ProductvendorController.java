package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productvendor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productvendorController")
@ViewScoped
public class ProductvendorController extends AbstractController<Productvendor> {

    public ProductvendorController() {
        // Inform the Abstract parent controller of the concrete Productvendor Entity
        super(Productvendor.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductvendorPK(new com.kurtomerfaruk.primeadminbsb.models.ProductvendorPK());
    }

}
