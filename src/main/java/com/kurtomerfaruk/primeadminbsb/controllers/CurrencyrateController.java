package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Currencyrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "currencyrateController")
@ViewScoped
public class CurrencyrateController extends AbstractController<Currencyrate> {

    public CurrencyrateController() {
        // Inform the Abstract parent controller of the concrete Currencyrate Entity
        super(Currencyrate.class);
    }

}
