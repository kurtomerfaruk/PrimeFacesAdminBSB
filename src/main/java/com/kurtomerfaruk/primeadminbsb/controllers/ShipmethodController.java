package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Shipmethod;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "shipmethodController")
@ViewScoped
public class ShipmethodController extends AbstractController<Shipmethod> {

    public ShipmethodController() {
        // Inform the Abstract parent controller of the concrete Shipmethod Entity
        super(Shipmethod.class);
    }

}
