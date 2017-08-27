package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Department;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "departmentController")
@ViewScoped
public class DepartmentController extends AbstractController<Department> {

    public DepartmentController() {
        // Inform the Abstract parent controller of the concrete Department Entity
        super(Department.class);
    }

    /**
     * Sets the "items" attribute with a collection of Employeedepartmenthistory
     * entities that are retrieved from Department?cap_first and returns the
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
