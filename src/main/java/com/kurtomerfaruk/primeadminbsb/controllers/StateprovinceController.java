package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Stateprovince;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "stateprovinceController")
@ViewScoped
public class StateprovinceController extends AbstractController<Stateprovince> {

    public StateprovinceController() {
        // Inform the Abstract parent controller of the concrete Stateprovince Entity
        super(Stateprovince.class);
    }

}
