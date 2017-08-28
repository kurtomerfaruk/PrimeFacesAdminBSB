package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Currencyrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "currencyrateController")
@ViewScoped
public class CurrencyrateController extends AbstractController<Currencyrate> {

    @Inject
    private CurrencyController toCurrencyCodeController;
    @Inject
    private CurrencyController fromCurrencyCodeController;
    @Inject
    private MenuController menuController;

    public CurrencyrateController() {
        // Inform the Abstract parent controller of the concrete Currencyrate Entity
        super(Currencyrate.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        toCurrencyCodeController.setSelected(null);
        fromCurrencyCodeController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Currency controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareToCurrencyCode(ActionEvent event) {
        if (this.getSelected() != null && toCurrencyCodeController.getSelected() == null) {
            toCurrencyCodeController.setSelected(this.getSelected().getToCurrencyCode());
        }
    }

    /**
     * Sets the "selected" attribute of the Currency controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareFromCurrencyCode(ActionEvent event) {
        if (this.getSelected() != null && fromCurrencyCodeController.getSelected() == null) {
            fromCurrencyCodeController.setSelected(this.getSelected().getFromCurrencyCode());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Currencyrate?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Salesorderheader page
     */
    public void navigateSalesorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList());
        }
        menuController.setPageLink("/salesorderheader/index");
    }

}
