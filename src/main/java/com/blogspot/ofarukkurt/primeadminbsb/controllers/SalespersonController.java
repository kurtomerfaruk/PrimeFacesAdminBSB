package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesperson;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salespersonController")
@ViewScoped
public class SalespersonController extends AbstractController<Salesperson> {

    @Inject
    private SalesterritoryController territoryIDController;
    @Inject
    private EmployeeController employeeController;

    public SalespersonController() {
        // Inform the Abstract parent controller of the concrete Salesperson Entity
        super(Salesperson.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        territoryIDController.setSelected(null);
        employeeController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Store entities that are
     * retrieved from Salesperson?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Store page
     */
    public String navigateStoreList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Store_items", this.getSelected().getStoreList());
        }
        return "/store/index";
    }

    /**
     * Sets the "selected" attribute of the Salesterritory controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTerritoryID(ActionEvent event) {
        if (this.getSelected() != null && territoryIDController.getSelected() == null) {
            territoryIDController.setSelected(this.getSelected().getTerritoryID());
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
     * Sets the "items" attribute with a collection of Salespersonquotahistory
     * entities that are retrieved from Salesperson?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Salespersonquotahistory page
     */
    public String navigateSalespersonquotahistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salespersonquotahistory_items", this.getSelected().getSalespersonquotahistoryList());
        }
        return "/salespersonquotahistory/index";
    }

    /**
     * Sets the "items" attribute with a collection of Salesterritoryhistory
     * entities that are retrieved from Salesperson?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Salesterritoryhistory page
     */
    public String navigateSalesterritoryhistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesterritoryhistory_items", this.getSelected().getSalesterritoryhistoryList());
        }
        return "/salesterritoryhistory/index";
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderheader entities
     * that are retrieved from Salesperson?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Salesorderheader page
     */
    public String navigateSalesorderheaderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheader_items", this.getSelected().getSalesorderheaderList());
        }
        return "/salesorderheader/index";
    }

}
