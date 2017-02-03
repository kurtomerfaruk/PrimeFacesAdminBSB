package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Workorderrouting;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "workorderroutingController")
@ViewScoped
public class WorkorderroutingController extends AbstractController<Workorderrouting> {

    public WorkorderroutingController() {
        // Inform the Abstract parent controller of the concrete Workorderrouting Entity
        super(Workorderrouting.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setWorkorderroutingPK(new com.kurtomerfaruk.primeadminbsb.models.WorkorderroutingPK());
    }

}
