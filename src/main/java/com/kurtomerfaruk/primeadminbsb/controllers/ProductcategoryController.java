package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productcategoryController")
@ViewScoped
public class ProductcategoryController extends AbstractController<Productcategory> {

    public ProductcategoryController() {
        // Inform the Abstract parent controller of the concrete Productcategory Entity
        super(Productcategory.class);
    }

}
