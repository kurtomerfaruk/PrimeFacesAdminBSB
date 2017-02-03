package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salestaxrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salestaxrateController")
@ViewScoped
public class SalestaxrateController extends AbstractController<Salestaxrate> {

    public SalestaxrateController() {
        // Inform the Abstract parent controller of the concrete Salestaxrate Entity
        super(Salestaxrate.class);
    }

}
