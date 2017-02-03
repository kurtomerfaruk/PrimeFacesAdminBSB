package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Individual;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "individualController")
@ViewScoped
public class IndividualController extends AbstractController<Individual> {

    public IndividualController() {
        // Inform the Abstract parent controller of the concrete Individual Entity
        super(Individual.class);
    }

}
