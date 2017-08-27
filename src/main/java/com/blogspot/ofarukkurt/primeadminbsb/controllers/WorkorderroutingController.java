package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Workorderrouting;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "workorderroutingController")
@ViewScoped
public class WorkorderroutingController extends AbstractController<Workorderrouting> {

    @Inject
    private WorkorderController workorderController;
    @Inject
    private LocationController locationIDController;

    public WorkorderroutingController() {
        // Inform the Abstract parent controller of the concrete Workorderrouting Entity
        super(Workorderrouting.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getWorkorderroutingPK().setWorkOrderID(this.getSelected().getWorkorder().getWorkOrderID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setWorkorderroutingPK(new com.blogspot.ofarukkurt.primeadminbsb.models.WorkorderroutingPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        workorderController.setSelected(null);
        locationIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Workorder controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareWorkorder(ActionEvent event) {
        if (this.getSelected() != null && workorderController.getSelected() == null) {
            workorderController.setSelected(this.getSelected().getWorkorder());
        }
    }

    /**
     * Sets the "selected" attribute of the Location controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareLocationID(ActionEvent event) {
        if (this.getSelected() != null && locationIDController.getSelected() == null) {
            locationIDController.setSelected(this.getSelected().getLocationID());
        }
    }
}
