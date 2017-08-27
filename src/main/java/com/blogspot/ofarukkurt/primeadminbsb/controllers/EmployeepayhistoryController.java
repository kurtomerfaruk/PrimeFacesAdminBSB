package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Employeepayhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "employeepayhistoryController")
@ViewScoped
public class EmployeepayhistoryController extends AbstractController<Employeepayhistory> {

    @Inject
    private EmployeeController employeeController;

    public EmployeepayhistoryController() {
        // Inform the Abstract parent controller of the concrete Employeepayhistory Entity
        super(Employeepayhistory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getEmployeepayhistoryPK().setBusinessEntityID(this.getSelected().getEmployee().getBusinessEntityID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeepayhistoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        employeeController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Employee controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEmployee(ActionEvent event) {
        if (this.getSelected() != null && employeeController.getSelected() == null) {
            employeeController.setSelected(this.getSelected().getEmployee());
        }
    }
}
