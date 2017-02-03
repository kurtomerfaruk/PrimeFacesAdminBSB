package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderheadersalesreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesorderheadersalesreasonController")
@ViewScoped
public class SalesorderheadersalesreasonController extends AbstractController<Salesorderheadersalesreason> {

    public SalesorderheadersalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesorderheadersalesreason Entity
        super(Salesorderheadersalesreason.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderheadersalesreasonPK(new com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK());
    }

}
