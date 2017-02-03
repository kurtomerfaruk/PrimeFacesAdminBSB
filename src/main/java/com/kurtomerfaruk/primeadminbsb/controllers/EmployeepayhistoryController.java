package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employeepayhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "employeepayhistoryController")
@ViewScoped
public class EmployeepayhistoryController extends AbstractController<Employeepayhistory> {

    public EmployeepayhistoryController() {
        // Inform the Abstract parent controller of the concrete Employeepayhistory Entity
        super(Employeepayhistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeepayhistoryPK(new com.kurtomerfaruk.primeadminbsb.models.EmployeepayhistoryPK());
    }

}
