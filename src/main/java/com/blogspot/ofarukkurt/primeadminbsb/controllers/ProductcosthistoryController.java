package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productcosthistory;
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

@Named(value = "productcosthistoryController")
@ViewScoped
public class ProductcosthistoryController extends AbstractController<Productcosthistory> {

    @Inject
    private ProductController productController;

    public ProductcosthistoryController() {
        // Inform the Abstract parent controller of the concrete Productcosthistory Entity
        super(Productcosthistory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductcosthistoryPK().setProductID(this.getSelected().getProduct().getProductID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductcosthistoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductcosthistoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        productController.setSelected(null);
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
