package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Scrapreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "scrapreasonController")
@ViewScoped
public class ScrapreasonController extends AbstractController<Scrapreason> {

    public ScrapreasonController() {
        // Inform the Abstract parent controller of the concrete Scrapreason Entity
        super(Scrapreason.class);
    }

}
