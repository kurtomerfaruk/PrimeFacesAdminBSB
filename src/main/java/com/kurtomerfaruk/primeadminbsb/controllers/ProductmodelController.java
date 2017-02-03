package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodel;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productmodelController")
@ViewScoped
public class ProductmodelController extends AbstractController<Productmodel> {

    public ProductmodelController() {
        // Inform the Abstract parent controller of the concrete Productmodel Entity
        super(Productmodel.class);
    }

}
