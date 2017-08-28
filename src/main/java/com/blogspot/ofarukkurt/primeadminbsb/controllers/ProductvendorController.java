package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productvendor;
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

@Named(value = "productvendorController")
@ViewScoped
public class ProductvendorController extends AbstractController<Productvendor> {

    @Inject
    private VendorController vendorController;
    @Inject
    private UnitmeasureController unitMeasureCodeController;
    @Inject
    private ProductController productController;

    public ProductvendorController() {
        // Inform the Abstract parent controller of the concrete Productvendor Entity
        super(Productvendor.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductvendorPK().setProductID(this.getSelected().getProduct().getProductID());
        this.getSelected().getProductvendorPK().setBusinessEntityID(this.getSelected().getVendor().getBusinessEntityID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductvendorPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductvendorPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        vendorController.setSelected(null);
        unitMeasureCodeController.setSelected(null);
        productController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Vendor controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVendor(ActionEvent event) {
        if (this.getSelected() != null && vendorController.getSelected() == null) {
            vendorController.setSelected(this.getSelected().getVendor());
        }
    }

    /**
     * Sets the "selected" attribute of the Unitmeasure controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareUnitMeasureCode(ActionEvent event) {
        if (this.getSelected() != null && unitMeasureCodeController.getSelected() == null) {
            unitMeasureCodeController.setSelected(this.getSelected().getUnitMeasureCode());
        }
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
}
