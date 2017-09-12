package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Department;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "departmentController")
@ViewScoped
public class DepartmentController extends AbstractController<Department> {

    private static final long serialVersionUID = 4134924636036330760L;

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
