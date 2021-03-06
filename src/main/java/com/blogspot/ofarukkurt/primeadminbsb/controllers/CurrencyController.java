package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Currency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "currencyController")
@ViewScoped
public class CurrencyController extends AbstractController<Currency> {

    private static final long serialVersionUID = -4573752319131803266L;
    
    @Inject
    private MenuController menuController;

    public CurrencyController() {
        // Inform the Abstract parent controller of the concrete Currency Entity
        super(Currency.class);
    }

    /**
     * Sets the "items" attribute with a collection of Countryregioncurrency
     * entities that are retrieved from Currency?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateCountryregioncurrencyList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Countryregioncurrency_items", this.getSelected().getCountryregioncurrencyList());
        }
        menuController.setPageLink("/countryregioncurrency/index");
    }

    /**
     * Sets the "items" attribute with a collection of Currencyrate entities
     * that are retrieved from Currency?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateCurrencyrateList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Currencyrate_items", this.getSelected().getCurrencyrateList());
        }
        menuController.setPageLink("/currencyrate/index");
    }

    /**
     * Sets the "items" attribute with a collection of Currencyrate entities
     * that are retrieved from Currency?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Currencyrate page
     */
    public void navigateCurrencyrateList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Currencyrate_items", this.getSelected().getCurrencyrateList1());
        }
        menuController.setPageLink("/currencyrate/index");
    }

}
