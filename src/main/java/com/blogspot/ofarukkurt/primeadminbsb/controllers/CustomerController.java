package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Customer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "customerController")
@ViewScoped
public class CustomerController extends AbstractController<Customer> {

    @Inject
    private StoreController storeIDController;
    @Inject
    private SalesterritoryController territoryIDController;
    @Inject
    private PersonController personIDController;
    @Inject
    private MenuController menuController;

    public CustomerController() {
        // Inform the Abstract parent controller of the concrete Customer Entity
        super(Customer.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        storeIDController.setSelected(null);
        territoryIDController.setSelected(null);
        personIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Store controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareStoreID(ActionEvent event) {
        if (this.getSelected() != null && storeIDController.getSelected() == null) {
            storeIDController.setSelected(this.getSelected().getStoreID());
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
     * Sets the "selected" attribute of the Person controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePersonID(ActionEvent event) {
        if (this.getSelected() != null && personIDController.getSelected() == null) {
            personIDController.setSelected(this.getSelected().getPersonID());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Customer?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateSalesorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList());
        }
        menuController.setPageLink("/salesorderheader/index");
    }

}
