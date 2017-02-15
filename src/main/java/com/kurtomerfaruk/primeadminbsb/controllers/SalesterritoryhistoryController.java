package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesterritoryhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesterritoryhistoryController")
@ViewScoped
public class SalesterritoryhistoryController extends AbstractController<Salesterritoryhistory> {
    private static final long serialVersionUID = 5439743198730342747L;

    public SalesterritoryhistoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritoryhistory Entity
        super(Salesterritoryhistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesterritoryhistoryPK(new com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK());
    }

}
