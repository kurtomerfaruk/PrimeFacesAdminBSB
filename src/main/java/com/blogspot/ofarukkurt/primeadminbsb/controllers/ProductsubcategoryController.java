package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productsubcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "productsubcategoryController")
@ViewScoped
public class ProductsubcategoryController extends AbstractController<Productsubcategory> {

    @Inject
    private ProductcategoryController productCategoryIDController;

    public ProductsubcategoryController() {
        // Inform the Abstract parent controller of the concrete Productsubcategory Entity
        super(Productsubcategory.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productCategoryIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Productcategory controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductCategoryID(ActionEvent event) {
        if (this.getSelected() != null && productCategoryIDController.getSelected() == null) {
            productCategoryIDController.setSelected(this.getSelected().getProductCategoryID());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Product entities that are
     * retrieved from Productsubcategory?cap_first and returns the navigation
     * outcome.
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
