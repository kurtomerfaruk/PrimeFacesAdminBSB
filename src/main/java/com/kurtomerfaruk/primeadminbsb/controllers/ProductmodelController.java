package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodel;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "productmodelController")
@ViewScoped
public class ProductmodelController extends AbstractController<Productmodel> {

    public ProductmodelController() {
        // Inform the Abstract parent controller of the concrete Productmodel Entity
        super(Productmodel.class);
    }

    /**
     * Sets the "items" attribute with a collection of Productmodelillustration
     * entities that are retrieved from Productmodel?cap_first and returns the
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

    /**
     * Sets the "items" attribute with a collection of
     * Productmodelproductdescriptionculture entities that are retrieved from
     * Productmodel?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Productmodelproductdescriptionculture page
     */
    public String navigateProductmodelproductdescriptioncultureList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productmodelproductdescriptionculture_items", this.getSelected().getProductmodelproductdescriptioncultureList());
        }
        return "/productmodelproductdescriptionculture/index";
    }

    /**
     * Sets the "items" attribute with a collection of Product entities that are
     * retrieved from Productmodel?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Product page
     */
    public String navigateProductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Product_items", this.getSelected().getProductList());
        }
        return "/product/index";
    }

}
