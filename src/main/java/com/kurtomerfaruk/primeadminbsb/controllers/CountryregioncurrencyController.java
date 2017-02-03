package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Countryregioncurrency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "countryregioncurrencyController")
@ViewScoped
public class CountryregioncurrencyController extends AbstractController<Countryregioncurrency> {

    public CountryregioncurrencyController() {
        // Inform the Abstract parent controller of the concrete Countryregioncurrency Entity
        super(Countryregioncurrency.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setCountryregioncurrencyPK(new com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK());
    }

}
