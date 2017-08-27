package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Person;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personController")
@ViewScoped
public class PersonController extends AbstractController<Person> {

    @Inject
    private BusinessentityController businessentityController;
    @Inject
    private PasswordController passwordController;
    @Inject
    private EmployeeController employeeController;

    public PersonController() {
        // Inform the Abstract parent controller of the concrete Person Entity
        super(Person.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        businessentityController.setSelected(null);
        passwordController.setSelected(null);
        employeeController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Businessentity controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBusinessentity(ActionEvent event) {
        if (this.getSelected() != null && businessentityController.getSelected() == null) {
            businessentityController.setSelected(this.getSelected().getBusinessentity());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Customer entities that
     * are retrieved from Person?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Customer page
     */
    public String navigateCustomerList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Customer_items", this.getSelected().getCustomerList());
        }
        return "/customer/index";
    }

    /**
     * Sets the "selected" attribute of the Password controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePassword(ActionEvent event) {
        if (this.getSelected() != null && passwordController.getSelected() == null) {
            passwordController.setSelected(this.getSelected().getPassword());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Emailaddress entities
     * that are retrieved from Person?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Emailaddress page
     */
    public String navigateEmailaddressList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Emailaddress_items", this.getSelected().getEmailaddressList());
        }
        return "/emailaddress/index";
    }

    /**
     * Sets the "items" attribute with a collection of Personphone entities that
     * are retrieved from Person?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Personphone page
     */
    public String navigatePersonphoneList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Personphone_items", this.getSelected().getPersonphoneList());
        }
        return "/personphone/index";
    }

    /**
     * Sets the "items" attribute with a collection of Businessentitycontact
     * entities that are retrieved from Person?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Businessentitycontact page
     */
    public String navigateBusinessentitycontactList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Businessentitycontact_items", this.getSelected().getBusinessentitycontactList());
        }
        return "/businessentitycontact/index";
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
     * Sets the "items" attribute with a collection of Personcreditcard entities
     * that are retrieved from Person?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Personcreditcard page
     */
    public String navigatePersoncreditcardList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Personcreditcard_items", this.getSelected().getPersoncreditcardList());
        }
        return "/personcreditcard/index";
    }

}
