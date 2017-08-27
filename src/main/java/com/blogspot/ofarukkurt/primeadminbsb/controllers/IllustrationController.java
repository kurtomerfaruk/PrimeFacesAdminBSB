package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Illustration;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "illustrationController")
@ViewScoped
public class IllustrationController extends AbstractController<Illustration> {

    public IllustrationController() {
        // Inform the Abstract parent controller of the concrete Illustration Entity
        super(Illustration.class);
    }

    /**
     * Sets the "items" attribute with a collection of Productmodelillustration
     * entities that are retrieved from Illustration?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productmodelillustration page
     */
    public String navigateProductmodelillustrationList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productmodelillustration_items", this.getSelected().getProductmodelillustrationList());
        }
        return "/productmodelillustration/index";
    }

}
