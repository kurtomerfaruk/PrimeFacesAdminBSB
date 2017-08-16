package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productdescription;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "productdescriptionController")
@ViewScoped
public class ProductdescriptionController extends AbstractController<Productdescription> {

    public ProductdescriptionController() {
        // Inform the Abstract parent controller of the concrete Productdescription Entity
        super(Productdescription.class);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Productmodelproductdescriptionculture entities that are retrieved from
     * Productdescription?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Productmodelproductdescriptionculture page
     */
    public String navigateProductmodelproductdescriptioncultureList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productmodelproductdescriptionculture_items", this.getSelected().getProductmodelproductdescriptioncultureList());
        }
        return "/productmodelproductdescriptionculture/index";
    }

}
