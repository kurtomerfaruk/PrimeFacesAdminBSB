package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderheader;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salesorderheaderController")
@ViewScoped
public class SalesorderheaderController extends AbstractController<Salesorderheader> {

    @Inject
    private ShipmethodController shipMethodIDController;
    @Inject
    private SalesterritoryController territoryIDController;
    @Inject
    private SalespersonController salesPersonIDController;
    @Inject
    private CustomerController customerIDController;
    @Inject
    private CurrencyrateController currencyRateIDController;
    @Inject
    private CreditcardController creditCardIDController;
    @Inject
    private AddressController shipToAddressIDController;
    @Inject
    private AddressController billToAddressIDController;

    public SalesorderheaderController() {
        // Inform the Abstract parent controller of the concrete Salesorderheader Entity
        super(Salesorderheader.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        shipMethodIDController.setSelected(null);
        territoryIDController.setSelected(null);
        salesPersonIDController.setSelected(null);
        customerIDController.setSelected(null);
        currencyRateIDController.setSelected(null);
        creditCardIDController.setSelected(null);
        shipToAddressIDController.setSelected(null);
        billToAddressIDController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Salesorderheadersalesreason entities that are retrieved from
     * Salesorderheader?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Salesorderheadersalesreason page
     */
    public String navigateSalesorderheadersalesreasonList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheadersalesreason_items", this.getSelected().getSalesorderheadersalesreasonList());
        }
        return "/salesorderheadersalesreason/index";
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderdetail entities
     * that are retrieved from Salesorderheader?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Salesorderdetail page
     */
    public String navigateSalesorderdetailList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderdetail_items", this.getSelected().getSalesorderdetailList());
        }
        return "/salesorderdetail/index";
    }

    /**
     * Sets the "selected" attribute of the Shipmethod controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareShipMethodID(ActionEvent event) {
        if (this.getSelected() != null && shipMethodIDController.getSelected() == null) {
            shipMethodIDController.setSelected(this.getSelected().getShipMethodID());
        }
    }

    /**
     * Sets the "selected" attribute of the Salesterritory controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTerritoryID(ActionEvent event) {
        if (this.getSelected() != null && territoryIDController.getSelected() == null) {
            territoryIDController.setSelected(this.getSelected().getTerritoryID());
        }
    }

    /**
     * Sets the "selected" attribute of the Salesperson controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSalesPersonID(ActionEvent event) {
        if (this.getSelected() != null && salesPersonIDController.getSelected() == null) {
            salesPersonIDController.setSelected(this.getSelected().getSalesPersonID());
        }
    }

    /**
     * Sets the "selected" attribute of the Customer controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCustomerID(ActionEvent event) {
        if (this.getSelected() != null && customerIDController.getSelected() == null) {
            customerIDController.setSelected(this.getSelected().getCustomerID());
        }
    }

    /**
     * Sets the "selected" attribute of the Currencyrate controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCurrencyRateID(ActionEvent event) {
        if (this.getSelected() != null && currencyRateIDController.getSelected() == null) {
            currencyRateIDController.setSelected(this.getSelected().getCurrencyRateID());
        }
    }

    /**
     * Sets the "selected" attribute of the Creditcard controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCreditCardID(ActionEvent event) {
        if (this.getSelected() != null && creditCardIDController.getSelected() == null) {
            creditCardIDController.setSelected(this.getSelected().getCreditCardID());
        }
    }

    /**
     * Sets the "selected" attribute of the Address controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareShipToAddressID(ActionEvent event) {
        if (this.getSelected() != null && shipToAddressIDController.getSelected() == null) {
            shipToAddressIDController.setSelected(this.getSelected().getShipToAddressID());
        }
    }

    /**
     * Sets the "selected" attribute of the Address controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBillToAddressID(ActionEvent event) {
        if (this.getSelected() != null && billToAddressIDController.getSelected() == null) {
            billToAddressIDController.setSelected(this.getSelected().getBillToAddressID());
        }
    }
}
