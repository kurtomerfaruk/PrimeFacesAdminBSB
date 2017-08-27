package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Employee;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "employeeController")
@ViewScoped
public class EmployeeController extends AbstractController<Employee> {

    @Inject
    private SalespersonController salespersonController;
    @Inject
    private PersonController personController;

    public EmployeeController() {
        // Inform the Abstract parent controller of the concrete Employee Entity
        super(Employee.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        salespersonController.setSelected(null);
        personController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderheader
     * entities that are retrieved from Employee?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Purchaseorderheader page
     */
    public String navigatePurchaseorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Purchaseorderheader_items", this.getSelected().getPurchaseorderheaderList());
        }
        return "/purchaseorderheader/index";
    }

    /**
     * Sets the "selected" attribute of the Salesperson controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSalesperson(ActionEvent event) {
        if (this.getSelected() != null && salespersonController.getSelected() == null) {
            salespersonController.setSelected(this.getSelected().getSalesperson());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Employeedepartmenthistory
     * entities that are retrieved from Employee?cap_first and returns the
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

    /**
     * Sets the "items" attribute with a collection of Jobcandidate entities
     * that are retrieved from Employee?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Jobcandidate page
     */
    public String navigateJobcandidateList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Jobcandidate_items", this.getSelected().getJobcandidateList());
        }
        return "/jobcandidate/index";
    }

    /**
     * Sets the "items" attribute with a collection of Document entities that
     * are retrieved from Employee?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Document page
     */
    public String navigateDocumentList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Document_items", this.getSelected().getDocumentList());
        }
        return "/document/index";
    }

    /**
     * Sets the "selected" attribute of the Person controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePerson(ActionEvent event) {
        if (this.getSelected() != null && personController.getSelected() == null) {
            personController.setSelected(this.getSelected().getPerson());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Employeepayhistory
     * entities that are retrieved from Employee?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Employeepayhistory page
     */
    public String navigateEmployeepayhistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Employeepayhistory_items", this.getSelected().getEmployeepayhistoryList());
        }
        return "/employeepayhistory/index";
    }

}
