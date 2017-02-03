package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employeedepartmenthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "employeedepartmenthistoryController")
@ViewScoped
public class EmployeedepartmenthistoryController extends AbstractController<Employeedepartmenthistory> {

    public EmployeedepartmenthistoryController() {
        // Inform the Abstract parent controller of the concrete Employeedepartmenthistory Entity
        super(Employeedepartmenthistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeedepartmenthistoryPK(new com.kurtomerfaruk.primeadminbsb.models.EmployeedepartmenthistoryPK());
    }

}
