package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productinventory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productinventoryController")
@ViewScoped
public class ProductinventoryController extends AbstractController<Productinventory> {

    public ProductinventoryController() {
        // Inform the Abstract parent controller of the concrete Productinventory Entity
        super(Productinventory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductinventoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK());
    }

}
