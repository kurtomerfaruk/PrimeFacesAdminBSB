package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Workorder;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "workorderController")
@ViewScoped
public class WorkorderController extends AbstractController<Workorder> {

    public WorkorderController() {
        // Inform the Abstract parent controller of the concrete Workorder Entity
        super(Workorder.class);
    }

}
