package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Shoppingcartitem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "shoppingcartitemController")
@ViewScoped
public class ShoppingcartitemController extends AbstractController<Shoppingcartitem> {

    private static final long serialVersionUID = -8762413301797698084L;

    @Inject
    private ProductController productIDController;

    public ShoppingcartitemController() {
        // Inform the Abstract parent controller of the concrete Shoppingcartitem Entity
        super(Shoppingcartitem.class);
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
