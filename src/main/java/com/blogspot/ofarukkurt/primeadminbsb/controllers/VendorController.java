package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Vendor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "vendorController")
@ViewScoped
public class VendorController extends AbstractController<Vendor> {

    @Inject
    private BusinessentityController businessentityController;

    public VendorController() {
        // Inform the Abstract parent controller of the concrete Vendor Entity
        super(Vendor.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        businessentityController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderheader
     * entities that are retrieved from Vendor?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Purchaseorderheader page
     */
    public String navigatePurchaseorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Purchaseorderheader_items", this.getSelected().getPurchaseorderheaderList());
        }
        return "/purchaseorderheader/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productvendor entities
     * that are retrieved from Vendor?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productvendor page
     */
    public String navigateProductvendorList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productvendor_items", this.getSelected().getProductvendorList());
        }
        return "/productvendor/index";
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
}
