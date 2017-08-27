package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Purchaseorderheader;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "purchaseorderheaderController")
@ViewScoped
public class PurchaseorderheaderController extends AbstractController<Purchaseorderheader> {

    @Inject
    private VendorController vendorIDController;
    @Inject
    private ShipmethodController shipMethodIDController;
    @Inject
    private EmployeeController employeeIDController;

    public PurchaseorderheaderController() {
        // Inform the Abstract parent controller of the concrete Purchaseorderheader Entity
        super(Purchaseorderheader.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        vendorIDController.setSelected(null);
        shipMethodIDController.setSelected(null);
        employeeIDController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderdetail
     * entities that are retrieved from Purchaseorderheader?cap_first and
     * returns the navigation outcome.
     *
     * @return navigation outcome for Purchaseorderdetail page
     */
    public String navigatePurchaseorderdetailList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Purchaseorderdetail_items", this.getSelected().getPurchaseorderdetailList());
        }
        return "/purchaseorderdetail/index";
    }

    /**
     * Sets the "selected" attribute of the Vendor controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVendorID(ActionEvent event) {
        if (this.getSelected() != null && vendorIDController.getSelected() == null) {
            vendorIDController.setSelected(this.getSelected().getVendorID());
        }
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
     * Sets the "selected" attribute of the Employee controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEmployeeID(ActionEvent event) {
        if (this.getSelected() != null && employeeIDController.getSelected() == null) {
            employeeIDController.setSelected(this.getSelected().getEmployeeID());
        }
    }
}
