package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productlistpricehistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productlistpricehistoryController")
@ViewScoped
public class ProductlistpricehistoryController extends AbstractController<Productlistpricehistory> {

    public ProductlistpricehistoryController() {
        // Inform the Abstract parent controller of the concrete Productlistpricehistory Entity
        super(Productlistpricehistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductlistpricehistoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductlistpricehistoryPK());
    }

}
