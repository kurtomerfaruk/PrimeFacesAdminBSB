package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Address;
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

@Named(value = "addressController")
@ViewScoped
public class AddressController extends AbstractController<Address> {
    private static final long serialVersionUID = -5947068396049341004L;

    @Inject
    private StateprovinceController stateProvinceIDController;
    @Inject
    private MenuController menuController;

    public AddressController() {
        // Inform the Abstract parent controller of the concrete Address Entity
        super(Address.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        stateProvinceIDController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Businessentityaddress
     * entities that are retrieved from Address?cap_first and returns the
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
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Address?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateSalesorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList());
        }
        menuController.setPageLink("/salesorderheader/index");
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Address?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateSalesorderheaderList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList1());
        }
        menuController.setPageLink("/salesorderheader/index");
    }

    /**
     * Sets the "selected" attribute of the Stateprovince controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareStateProvinceID(ActionEvent event) {
        if (this.getSelected() != null && stateProvinceIDController.getSelected() == null) {
            stateProvinceIDController.setSelected(this.getSelected().getStateProvinceID());
        }
    }
}
