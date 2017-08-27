package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Contacttype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "contacttypeController")
@ViewScoped
public class ContacttypeController extends AbstractController<Contacttype> {

    private static final long serialVersionUID = -3593247434399988796L;
    
    @Inject
    private MenuController menuController;

    public ContacttypeController() {
        // Inform the Abstract parent controller of the concrete Contacttype Entity
        super(Contacttype.class);
    }

    /**
     * Sets the "items" attribute with a collection of Businessentitycontact
     * entities that are retrieved from Contacttype?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateBusinessentitycontactList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Businessentitycontact_items", this.getSelected().getBusinessentitycontactList());
        }
        menuController.setPageLink("/businessentitycontact/index");
    }

}
