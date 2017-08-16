package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Currency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "currencyController")
@ViewScoped
public class CurrencyController extends AbstractController<Currency> {

    public CurrencyController() {
        // Inform the Abstract parent controller of the concrete Currency Entity
        super(Currency.class);
    }

    /**
     * Sets the "items" attribute with a collection of Countryregioncurrency
     * entities that are retrieved from Currency?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Countryregioncurrency page
     */
    public String navigateCountryregioncurrencyList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Countryregioncurrency_items", this.getSelected().getCountryregioncurrencyList());
        }
        return "/countryregioncurrency/index";
    }

    /**
     * Sets the "items" attribute with a collection of Currencyrate entities
     * that are retrieved from Currency?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Currencyrate page
     */
    public String navigateCurrencyrateList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Currencyrate_items", this.getSelected().getCurrencyrateList());
        }
        return "/currencyrate/index";
    }

    /**
     * Sets the "items" attribute with a collection of Currencyrate entities
     * that are retrieved from Currency?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Currencyrate page
     */
    public String navigateCurrencyrateList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Currencyrate_items", this.getSelected().getCurrencyrateList1());
        }
        return "/currencyrate/index";
    }

}
