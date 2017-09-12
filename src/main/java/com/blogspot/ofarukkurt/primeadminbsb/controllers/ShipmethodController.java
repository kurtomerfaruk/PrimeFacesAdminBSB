package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Shipmethod;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */


@Named(value = "shipmethodController")
@ViewScoped
public class ShipmethodController extends AbstractController<Shipmethod> {

    private static final long serialVersionUID = -8116172943716458082L;

    public ShipmethodController() {
        // Inform the Abstract parent controller of the concrete Shipmethod Entity
        super(Shipmethod.class);
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderheader
     * entities that are retrieved from Shipmethod?cap_first and returns the
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
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Shipmethod?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Salesorderheader page
     */
    public String navigateSalesorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList());
        }
        return "/salesorderheader/index";
    }

}
