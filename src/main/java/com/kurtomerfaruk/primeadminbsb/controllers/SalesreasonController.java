package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesreasonController")
@ViewScoped
public class SalesreasonController extends AbstractController<Salesreason> {
    private static final long serialVersionUID = -19299076833917278L;

    public SalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesreason Entity
        super(Salesreason.class);
    }

}
