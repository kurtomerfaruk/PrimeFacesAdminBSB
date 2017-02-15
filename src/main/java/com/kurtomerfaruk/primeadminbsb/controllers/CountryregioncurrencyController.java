package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Countryregioncurrency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "countryregioncurrencyController")
@ViewScoped
public class CountryregioncurrencyController extends AbstractController<Countryregioncurrency> {
    private static final long serialVersionUID = 5602734446262751047L;

    public CountryregioncurrencyController() {
        // Inform the Abstract parent controller of the concrete Countryregioncurrency Entity
        super(Countryregioncurrency.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setCountryregioncurrencyPK(new com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK());
    }

}
