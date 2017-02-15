package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employeepayhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "employeepayhistoryController")
@ViewScoped
public class EmployeepayhistoryController extends AbstractController<Employeepayhistory> {
    private static final long serialVersionUID = 1166138026552117769L;

    public EmployeepayhistoryController() {
        // Inform the Abstract parent controller of the concrete Employeepayhistory Entity
        super(Employeepayhistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeepayhistoryPK(new com.kurtomerfaruk.primeadminbsb.models.EmployeepayhistoryPK());
    }

}
