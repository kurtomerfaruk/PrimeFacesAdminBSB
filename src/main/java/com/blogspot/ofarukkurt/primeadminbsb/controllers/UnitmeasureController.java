package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Unitmeasure;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "unitmeasureController")
@ViewScoped
public class UnitmeasureController extends AbstractController<Unitmeasure> {

    public UnitmeasureController() {
        // Inform the Abstract parent controller of the concrete Unitmeasure Entity
        super(Unitmeasure.class);
    }

    /**
     * Sets the "items" attribute with a collection of Billofmaterials entities
     * that are retrieved from Unitmeasure?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Billofmaterials page
     */
    public String navigateBillofmaterialsList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Billofmaterials_items", this.getSelected().getBillofmaterialsList());
        }
        return "/billofmaterials/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productvendor entities
     * that are retrieved from Unitmeasure?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productvendor page
     */
    public String navigateProductvendorList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productvendor_items", this.getSelected().getProductvendorList());
        }
        return "/productvendor/index";
    }

    /**
     * Sets the "items" attribute with a collection of Product entities that are
     * retrieved from Unitmeasure?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Product page
     */
    public String navigateProductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Product_items", this.getSelected().getProductList());
        }
        return "/product/index";
    }

    /**
     * Sets the "items" attribute with a collection of Product entities that are
     * retrieved from Unitmeasure?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Product page
     */
    public String navigateProductList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Product_items", this.getSelected().getProductList1());
        }
        return "/product/index";
    }

}
