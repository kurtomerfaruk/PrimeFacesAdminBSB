package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Businessentity;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "businessentityController")
@ViewScoped
public class BusinessentityController extends AbstractController<Businessentity> {
    private static final long serialVersionUID = 8499943606150452608L;

    @Inject
    private PersonController personController;
    @Inject
    private StoreController storeController;
    @Inject
    private VendorController vendorController;
    @Inject
    private MenuController menuController;

    public BusinessentityController() {
        // Inform the Abstract parent controller of the concrete Businessentity Entity
        super(Businessentity.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        personController.setSelected(null);
        storeController.setSelected(null);
        vendorController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Person controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePerson(ActionEvent event) {
        if (this.getSelected() != null && personController.getSelected() == null) {
            personController.setSelected(this.getSelected().getPerson());
        }
    }

    /**
     * Sets the "selected" attribute of the Store controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareStore(ActionEvent event) {
        if (this.getSelected() != null && storeController.getSelected() == null) {
            storeController.setSelected(this.getSelected().getStore());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Businessentitycontact
     * entities that are retrieved from Businessentity?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateBusinessentitycontactList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Businessentitycontact_items", this.getSelected().getBusinessentitycontactList());
        }
        menuController.setPageLink("/businessentitycontact/index");
    }

    /**
     * Sets the "items" attribute with a collection of Businessentityaddress
     * entities that are retrieved from Businessentity?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateBusinessentityaddressList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Businessentityaddress_items", this.getSelected().getBusinessentityaddressList());
        }
        menuController.setPageLink("/businessentityaddress/index");
    }

    /**
     * Sets the "selected" attribute of the Vendor controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVendor(ActionEvent event) {
        if (this.getSelected() != null && vendorController.getSelected() == null) {
            vendorController.setSelected(this.getSelected().getVendor());
        }
    }
}
