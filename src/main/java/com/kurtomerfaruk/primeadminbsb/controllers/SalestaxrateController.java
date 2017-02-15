package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salestaxrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salestaxrateController")
@ViewScoped
public class SalestaxrateController extends AbstractController<Salestaxrate> {
    private static final long serialVersionUID = -5642432615146151273L;

    public SalestaxrateController() {
        // Inform the Abstract parent controller of the concrete Salestaxrate Entity
        super(Salestaxrate.class);
    }

}
