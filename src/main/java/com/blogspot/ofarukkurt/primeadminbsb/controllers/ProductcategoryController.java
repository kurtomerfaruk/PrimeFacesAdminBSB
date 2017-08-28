package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productcategory;
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

@Named(value = "productcategoryController")
@ViewScoped
public class ProductcategoryController extends AbstractController<Productcategory> {
    
    @Inject
    private MenuController menuController;

    public ProductcategoryController() {
        // Inform the Abstract parent controller of the concrete Productcategory Entity
        super(Productcategory.class);
    }

    /**
     * Sets the "items" attribute with a collection of Productsubcategory
     * entities that are retrieved from Productcategory?cap_first and returns
     * the navigation outcome.
     *
     */
    public void navigateProductsubcategoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productsubcategory_items", this.getSelected().getProductsubcategoryList());
        }
        menuController.setPageLink("/productsubcategory/index");
    }

}
