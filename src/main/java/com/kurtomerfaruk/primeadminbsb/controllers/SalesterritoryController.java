package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesterritory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesterritoryController")
@ViewScoped
public class SalesterritoryController extends AbstractController<Salesterritory> {
    private static final long serialVersionUID = 1260107658230661982L;

    public SalesterritoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritory Entity
        super(Salesterritory.class);
    }

}
