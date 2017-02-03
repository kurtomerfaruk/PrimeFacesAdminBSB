package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesterritory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesterritoryController")
@ViewScoped
public class SalesterritoryController extends AbstractController<Salesterritory> {

    public SalesterritoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritory Entity
        super(Salesterritory.class);
    }

}
