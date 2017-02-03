package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productsubcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productsubcategoryController")
@ViewScoped
public class ProductsubcategoryController extends AbstractController<Productsubcategory> {

    public ProductsubcategoryController() {
        // Inform the Abstract parent controller of the concrete Productsubcategory Entity
        super(Productsubcategory.class);
    }

}
