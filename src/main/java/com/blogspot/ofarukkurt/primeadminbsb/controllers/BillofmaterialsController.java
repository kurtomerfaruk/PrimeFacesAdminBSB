package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Billofmaterials;
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

@Named(value = "billofmaterialsController")
@ViewScoped
public class BillofmaterialsController extends AbstractController<Billofmaterials> {
    private static final long serialVersionUID = 510511970033535891L;

    @Inject
    private UnitmeasureController unitMeasureCodeController;
    @Inject
    private ProductController productAssemblyIDController;
    @Inject
    private ProductController componentIDController;

    public BillofmaterialsController() {
        // Inform the Abstract parent controller of the concrete Billofmaterials Entity
        super(Billofmaterials.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        unitMeasureCodeController.setSelected(null);
        productAssemblyIDController.setSelected(null);
        componentIDController.setSelected(null);
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
    public void prepareProductAssemblyID(ActionEvent event) {
        if (this.getSelected() != null && productAssemblyIDController.getSelected() == null) {
            productAssemblyIDController.setSelected(this.getSelected().getProductAssemblyID());
        }
    }

    /**
     * Sets the "selected" attribute of the Product controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareComponentID(ActionEvent event) {
        if (this.getSelected() != null && componentIDController.getSelected() == null) {
            componentIDController.setSelected(this.getSelected().getComponentID());
        }
    }
}
