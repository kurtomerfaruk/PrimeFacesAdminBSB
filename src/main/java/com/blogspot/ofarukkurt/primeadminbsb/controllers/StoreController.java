package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Store;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "storeController")
@ViewScoped
public class StoreController extends AbstractController<Store> {

    @Inject
    private SalespersonController salesPersonIDController;
    @Inject
    private BusinessentityController businessentityController;

    public StoreController() {
        // Inform the Abstract parent controller of the concrete Store Entity
        super(Store.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        salesPersonIDController.setSelected(null);
        businessentityController.setSelected(null);
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
     * Sets the "selected" attribute of the Businessentity controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBusinessentity(ActionEvent event) {
        if (this.getSelected() != null && businessentityController.getSelected() == null) {
            businessentityController.setSelected(this.getSelected().getBusinessentity());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Customer entities that
     * are retrieved from Store?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Customer page
     */
    public String navigateCustomerList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Customer_items", this.getSelected().getCustomerList());
        }
        return "/customer/index";
    }

}
