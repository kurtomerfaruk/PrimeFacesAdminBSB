package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productmodelillustration;
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

@Named(value = "productmodelillustrationController")
@ViewScoped
public class ProductmodelillustrationController extends AbstractController<Productmodelillustration> {

    @Inject
    private ProductmodelController productmodelController;
    @Inject
    private IllustrationController illustrationController;

    public ProductmodelillustrationController() {
        // Inform the Abstract parent controller of the concrete Productmodelillustration Entity
        super(Productmodelillustration.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductmodelillustrationPK().setProductModelID(this.getSelected().getProductmodel().getProductModelID());
        this.getSelected().getProductmodelillustrationPK().setIllustrationID(this.getSelected().getIllustration().getIllustrationID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelillustrationPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductmodelillustrationPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productmodelController.setSelected(null);
        illustrationController.setSelected(null);
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
     * Sets the "selected" attribute of the Illustration controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareIllustration(ActionEvent event) {
        if (this.getSelected() != null && illustrationController.getSelected() == null) {
            illustrationController.setSelected(this.getSelected().getIllustration());
        }
    }
}
