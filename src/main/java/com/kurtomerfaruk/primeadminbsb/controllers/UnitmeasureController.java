package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Unitmeasure;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "unitmeasureController")
@ViewScoped
public class UnitmeasureController extends AbstractController<Unitmeasure> {

    public UnitmeasureController() {
        // Inform the Abstract parent controller of the concrete Unitmeasure Entity
        super(Unitmeasure.class);
    }

}
