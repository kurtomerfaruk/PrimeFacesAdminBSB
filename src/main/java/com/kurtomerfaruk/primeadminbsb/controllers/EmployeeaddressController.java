package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employeeaddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "employeeaddressController")
@ViewScoped
public class EmployeeaddressController extends AbstractController<Employeeaddress> {
    private static final long serialVersionUID = -175923594059801554L;

    public EmployeeaddressController() {
        // Inform the Abstract parent controller of the concrete Employeeaddress Entity
        super(Employeeaddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeeaddressPK(new com.kurtomerfaruk.primeadminbsb.models.EmployeeaddressPK());
    }

}
