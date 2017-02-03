package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesterritoryhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesterritoryhistoryController")
@ViewScoped
public class SalesterritoryhistoryController extends AbstractController<Salesterritoryhistory> {

    public SalesterritoryhistoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritoryhistory Entity
        super(Salesterritoryhistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesterritoryhistoryPK(new com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK());
    }

}
