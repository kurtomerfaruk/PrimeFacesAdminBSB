package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employeedepartmenthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "employeedepartmenthistoryController")
@ViewScoped
public class EmployeedepartmenthistoryController extends AbstractController<Employeedepartmenthistory> {
    private static final long serialVersionUID = -8509938679571506329L;

    public EmployeedepartmenthistoryController() {
        // Inform the Abstract parent controller of the concrete Employeedepartmenthistory Entity
        super(Employeedepartmenthistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeedepartmenthistoryPK(new com.kurtomerfaruk.primeadminbsb.models.EmployeedepartmenthistoryPK());
    }

}
