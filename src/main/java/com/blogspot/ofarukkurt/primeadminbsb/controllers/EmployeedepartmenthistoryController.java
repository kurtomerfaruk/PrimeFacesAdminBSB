package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Employeedepartmenthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "employeedepartmenthistoryController")
@ViewScoped
public class EmployeedepartmenthistoryController extends AbstractController<Employeedepartmenthistory> {

    @Inject
    private ShiftController shiftController;
    @Inject
    private EmployeeController employeeController;
    @Inject
    private DepartmentController departmentController;

    public EmployeedepartmenthistoryController() {
        // Inform the Abstract parent controller of the concrete Employeedepartmenthistory Entity
        super(Employeedepartmenthistory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getEmployeedepartmenthistoryPK().setBusinessEntityID(this.getSelected().getEmployee().getBusinessEntityID());
        this.getSelected().getEmployeedepartmenthistoryPK().setDepartmentID(this.getSelected().getDepartment().getDepartmentID());
        this.getSelected().getEmployeedepartmenthistoryPK().setShiftID(this.getSelected().getShift().getShiftID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeedepartmenthistoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.EmployeedepartmenthistoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        shiftController.setSelected(null);
        employeeController.setSelected(null);
        departmentController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Shift controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareShift(ActionEvent event) {
        if (this.getSelected() != null && shiftController.getSelected() == null) {
            shiftController.setSelected(this.getSelected().getShift());
        }
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

    /**
     * Sets the "selected" attribute of the Department controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDepartment(ActionEvent event) {
        if (this.getSelected() != null && departmentController.getSelected() == null) {
            departmentController.setSelected(this.getSelected().getDepartment());
        }
    }
}
