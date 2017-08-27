package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salestaxrate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salestaxrateController")
@ViewScoped
public class SalestaxrateController extends AbstractController<Salestaxrate> {

    @Inject
    private StateprovinceController stateProvinceIDController;

    public SalestaxrateController() {
        // Inform the Abstract parent controller of the concrete Salestaxrate Entity
        super(Salestaxrate.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        stateProvinceIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Stateprovince controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareStateProvinceID(ActionEvent event) {
        if (this.getSelected() != null && stateProvinceIDController.getSelected() == null) {
            stateProvinceIDController.setSelected(this.getSelected().getStateProvinceID());
        }
    }
}
