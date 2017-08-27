package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Addresstype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "addresstypeController")
@ViewScoped
public class AddresstypeController extends AbstractController<Addresstype> {
    private static final long serialVersionUID = -3921893572963721160L;
    
    @Inject
    private MenuController menuController;

    public AddresstypeController() {
        // Inform the Abstract parent controller of the concrete Addresstype Entity
        super(Addresstype.class);
    }

    /**
     * Sets the "items" attribute with a collection of Businessentityaddress
     * entities that are retrieved from Addresstype?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateBusinessentityaddressList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Businessentityaddress_items", this.getSelected().getBusinessentityaddressList());
        }
        menuController.setPageLink("/businessentityaddress/index");
    }

}
