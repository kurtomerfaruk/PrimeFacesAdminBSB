package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Countryregioncurrency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "countryregioncurrencyController")
@ViewScoped
public class CountryregioncurrencyController extends AbstractController<Countryregioncurrency> {

    private static final long serialVersionUID = 1730582070657697217L;

    @Inject
    private CurrencyController currencyController;
    @Inject
    private CountryregionController countryregionController;

    public CountryregioncurrencyController() {
        // Inform the Abstract parent controller of the concrete Countryregioncurrency Entity
        super(Countryregioncurrency.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getCountryregioncurrencyPK().setCountryRegionCode(this.getSelected().getCountryregion().getCountryRegionCode());
        this.getSelected().getCountryregioncurrencyPK().setCurrencyCode(this.getSelected().getCurrency().getCurrencyCode());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setCountryregioncurrencyPK(new com.blogspot.ofarukkurt.primeadminbsb.models.CountryregioncurrencyPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        currencyController.setSelected(null);
        countryregionController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Currency controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCurrency(ActionEvent event) {
        if (this.getSelected() != null && currencyController.getSelected() == null) {
            currencyController.setSelected(this.getSelected().getCurrency());
        }
    }

    /**
     * Sets the "selected" attribute of the Countryregion controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCountryregion(ActionEvent event) {
        if (this.getSelected() != null && countryregionController.getSelected() == null) {
            countryregionController.setSelected(this.getSelected().getCountryregion());
        }
    }
}
