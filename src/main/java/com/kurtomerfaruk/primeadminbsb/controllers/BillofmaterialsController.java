package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Billofmaterials;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "billofmaterialsController")
@ViewScoped
public class BillofmaterialsController extends AbstractController<Billofmaterials> {

    public BillofmaterialsController() {
        // Inform the Abstract parent controller of the concrete Billofmaterials Entity
        super(Billofmaterials.class);
    }

}
