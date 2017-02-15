package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Stateprovince;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "stateprovinceController")
@ViewScoped
public class StateprovinceController extends AbstractController<Stateprovince> {
    private static final long serialVersionUID = -4301966172471903188L;

    public StateprovinceController() {
        // Inform the Abstract parent controller of the concrete Stateprovince Entity
        super(Stateprovince.class);
    }

}
