package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesperson;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salespersonController")
@ViewScoped
public class SalespersonController extends AbstractController<Salesperson> {
    private static final long serialVersionUID = 8841287378480326229L;

    public SalespersonController() {
        // Inform the Abstract parent controller of the concrete Salesperson Entity
        super(Salesperson.class);
    }

}
