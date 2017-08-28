package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productproductphoto;
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

@Named(value = "productproductphotoController")
@ViewScoped
public class ProductproductphotoController extends AbstractController<Productproductphoto> {

    @Inject
    private ProductController productController;
    @Inject
    private ProductphotoController productphotoController;

    public ProductproductphotoController() {
        // Inform the Abstract parent controller of the concrete Productproductphoto Entity
        super(Productproductphoto.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductproductphotoPK().setProductID(this.getSelected().getProduct().getProductID());
        this.getSelected().getProductproductphotoPK().setProductPhotoID(this.getSelected().getProductphoto().getProductPhotoID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductproductphotoPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productController.setSelected(null);
        productphotoController.setSelected(null);
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
     * Sets the "selected" attribute of the Productphoto controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductphoto(ActionEvent event) {
        if (this.getSelected() != null && productphotoController.getSelected() == null) {
            productphotoController.setSelected(this.getSelected().getProductphoto());
        }
    }
}
