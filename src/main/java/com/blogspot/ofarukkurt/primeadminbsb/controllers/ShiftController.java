package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Shift;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "shiftController")
@ViewScoped
public class ShiftController extends AbstractController<Shift> {

    public ShiftController() {
        // Inform the Abstract parent controller of the concrete Shift Entity
        super(Shift.class);
    }

    /**
     * Sets the "items" attribute with a collection of Employeedepartmenthistory
     * entities that are retrieved from Shift?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Employeedepartmenthistory page
     */
    public String navigateEmployeedepartmenthistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Employeedepartmenthistory_items", this.getSelected().getEmployeedepartmenthistoryList());
        }
        return "/employeedepartmenthistory/index";
    }

}
