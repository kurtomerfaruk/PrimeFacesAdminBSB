package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productinventory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "productinventoryController")
@ViewScoped
public class ProductinventoryController extends AbstractController<Productinventory> {

    @Inject
    private ProductController productController;
    @Inject
    private LocationController locationController;

    public ProductinventoryController() {
        // Inform the Abstract parent controller of the concrete Productinventory Entity
        super(Productinventory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductinventoryPK().setProductID(this.getSelected().getProduct().getProductID());
        this.getSelected().getProductinventoryPK().setLocationID(this.getSelected().getLocation().getLocationID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductinventoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductinventoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productController.setSelected(null);
        locationController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Product controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProduct(ActionEvent event) {
        if (this.getSelected() != null && productController.getSelected() == null) {
            productController.setSelected(this.getSelected().getProduct());
        }
    }

    /**
     * Sets the "selected" attribute of the Location controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareLocation(ActionEvent event) {
        if (this.getSelected() != null && locationController.getSelected() == null) {
            locationController.setSelected(this.getSelected().getLocation());
        }
    }
}
