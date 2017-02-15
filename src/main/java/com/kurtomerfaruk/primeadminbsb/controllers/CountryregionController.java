package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Countryregion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "countryregionController")
@ViewScoped
public class CountryregionController extends AbstractController<Countryregion> {
    private static final long serialVersionUID = 5438375744688577364L;

    public CountryregionController() {
        // Inform the Abstract parent controller of the concrete Countryregion Entity
        super(Countryregion.class);
    }

}
