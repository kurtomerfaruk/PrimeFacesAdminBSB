package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productphoto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productphotoController")
@ViewScoped
public class ProductphotoController extends AbstractController<Productphoto> {

    public ProductphotoController() {
        // Inform the Abstract parent controller of the concrete Productphoto Entity
        super(Productphoto.class);
    }

}
