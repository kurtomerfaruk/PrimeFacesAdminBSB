package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Currencyrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "currencyrateController")
@ViewScoped
public class CurrencyrateController extends AbstractController<Currencyrate> {
    private static final long serialVersionUID = 7968985303370023900L;

    public CurrencyrateController() {
        // Inform the Abstract parent controller of the concrete Currencyrate Entity
        super(Currencyrate.class);
    }

}
