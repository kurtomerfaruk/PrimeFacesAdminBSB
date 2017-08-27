package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Creditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "creditcardController")
@ViewScoped
public class CreditcardController extends AbstractController<Creditcard> {
    private static final long serialVersionUID = -7996716303894190337L;
    
    @Inject
    private MenuController menuController;

    public CreditcardController() {
        // Inform the Abstract parent controller of the concrete Creditcard Entity
        super(Creditcard.class);
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Creditcard?cap_first and returns the navigation
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
     * Sets the "items" attribute with a collection of Personcreditcard entities
     * that are retrieved from Creditcard?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigatePersoncreditcardList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Personcreditcard_items", this.getSelected().getPersoncreditcardList());
        }
        menuController.setPageLink("/personcreditcard/index");
    }

}
