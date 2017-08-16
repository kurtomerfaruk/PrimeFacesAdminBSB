package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productreview;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "productreviewController")
@ViewScoped
public class ProductreviewController extends AbstractController<Productreview> {

    @Inject
    private ProductController productIDController;

    public ProductreviewController() {
        // Inform the Abstract parent controller of the concrete Productreview Entity
        super(Productreview.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Product controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductID(ActionEvent event) {
        if (this.getSelected() != null && productIDController.getSelected() == null) {
            productIDController.setSelected(this.getSelected().getProductID());
        }
    }
}
