package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Businessentityaddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "businessentityaddressController")
@ViewScoped
public class BusinessentityaddressController extends AbstractController<Businessentityaddress> {
    private static final long serialVersionUID = 2159323554194411834L;

    @Inject
    private BusinessentityController businessentityController;
    @Inject
    private AddressController addressController;
    @Inject
    private AddresstypeController addresstypeController;

    public BusinessentityaddressController() {
        // Inform the Abstract parent controller of the concrete Businessentityaddress Entity
        super(Businessentityaddress.class);
    }



    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        businessentityController.setSelected(null);
        addressController.setSelected(null);
        addresstypeController.setSelected(null);
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
     * Sets the "selected" attribute of the Address controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareAddress(ActionEvent event) {
        if (this.getSelected() != null && addressController.getSelected() == null) {
            addressController.setSelected(this.getSelected().getAddress());
        }
    }

    /**
     * Sets the "selected" attribute of the Addresstype controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareAddresstype(ActionEvent event) {
        if (this.getSelected() != null && addresstypeController.getSelected() == null) {
            addresstypeController.setSelected(this.getSelected().getAddresstype());
        }
    }
}
