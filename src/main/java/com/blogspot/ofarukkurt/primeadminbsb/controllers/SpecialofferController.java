package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Specialoffer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "specialofferController")
@ViewScoped
public class SpecialofferController extends AbstractController<Specialoffer> {

    public SpecialofferController() {
        // Inform the Abstract parent controller of the concrete Specialoffer Entity
        super(Specialoffer.class);
    }

    /**
     * Sets the "items" attribute with a collection of Specialofferproduct
     * entities that are retrieved from Specialoffer?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Specialofferproduct page
     */
    public String navigateSpecialofferproductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Specialofferproduct_items", this.getSelected().getSpecialofferproductList());
        }
        return "/specialofferproduct/index";
    }

}
