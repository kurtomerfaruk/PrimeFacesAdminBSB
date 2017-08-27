package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Jobcandidate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "jobcandidateController")
@ViewScoped
public class JobcandidateController extends AbstractController<Jobcandidate> {

    @Inject
    private EmployeeController businessEntityIDController;

    public JobcandidateController() {
        // Inform the Abstract parent controller of the concrete Jobcandidate Entity
        super(Jobcandidate.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        businessEntityIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Employee controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBusinessEntityID(ActionEvent event) {
        if (this.getSelected() != null && businessEntityIDController.getSelected() == null) {
            businessEntityIDController.setSelected(this.getSelected().getBusinessEntityID());
        }
    }
}
