package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productcosthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productcosthistoryController")
@ViewScoped
public class ProductcosthistoryController extends AbstractController<Productcosthistory> {

    public ProductcosthistoryController() {
        // Inform the Abstract parent controller of the concrete Productcosthistory Entity
        super(Productcosthistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductcosthistoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductcosthistoryPK());
    }

}
