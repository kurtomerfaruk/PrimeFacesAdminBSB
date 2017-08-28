package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productmodelproductdescriptionculture;
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

@Named(value = "productmodelproductdescriptioncultureController")
@ViewScoped
public class ProductmodelproductdescriptioncultureController extends AbstractController<Productmodelproductdescriptionculture> {

    @Inject
    private ProductmodelController productmodelController;
    @Inject
    private ProductdescriptionController productdescriptionController;
    @Inject
    private CultureController cultureController;

    public ProductmodelproductdescriptioncultureController() {
        // Inform the Abstract parent controller of the concrete Productmodelproductdescriptionculture Entity
        super(Productmodelproductdescriptionculture.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductmodelproductdescriptionculturePK().setProductModelID(this.getSelected().getProductmodel().getProductModelID());
        this.getSelected().getProductmodelproductdescriptionculturePK().setProductDescriptionID(this.getSelected().getProductdescription().getProductDescriptionID());
        this.getSelected().getProductmodelproductdescriptionculturePK().setCultureID(this.getSelected().getCulture().getCultureID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelproductdescriptionculturePK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductmodelproductdescriptionculturePK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productmodelController.setSelected(null);
        productdescriptionController.setSelected(null);
        cultureController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Productmodel controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductmodel(ActionEvent event) {
        if (this.getSelected() != null && productmodelController.getSelected() == null) {
            productmodelController.setSelected(this.getSelected().getProductmodel());
        }
    }

    /**
     * Sets the "selected" attribute of the Productdescription controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductdescription(ActionEvent event) {
        if (this.getSelected() != null && productdescriptionController.getSelected() == null) {
            productdescriptionController.setSelected(this.getSelected().getProductdescription());
        }
    }

    /**
     * Sets the "selected" attribute of the Culture controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCulture(ActionEvent event) {
        if (this.getSelected() != null && cultureController.getSelected() == null) {
            cultureController.setSelected(this.getSelected().getCulture());
        }
    }
}
