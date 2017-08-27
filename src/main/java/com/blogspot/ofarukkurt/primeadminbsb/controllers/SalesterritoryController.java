package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesterritory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salesterritoryController")
@ViewScoped
public class SalesterritoryController extends AbstractController<Salesterritory> {

    @Inject
    private CountryregionController countryRegionCodeController;

    public SalesterritoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritory Entity
        super(Salesterritory.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        countryRegionCodeController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Countryregion controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCountryRegionCode(ActionEvent event) {
        if (this.getSelected() != null && countryRegionCodeController.getSelected() == null) {
            countryRegionCodeController.setSelected(this.getSelected().getCountryRegionCode());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Customer entities that
     * are retrieved from Salesterritory?cap_first and returns the navigation
     * outcome.
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
     * Sets the "items" attribute with a collection of Salesperson entities that
     * are retrieved from Salesterritory?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Salesperson page
     */
    public String navigateSalespersonList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesperson_items", this.getSelected().getSalespersonList());
        }
        return "/salesperson/index";
    }

    /**
     * Sets the "items" attribute with a collection of Stateprovince entities
     * that are retrieved from Salesterritory?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Stateprovince page
     */
    public String navigateStateprovinceList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Stateprovince_items", this.getSelected().getStateprovinceList());
        }
        return "/stateprovince/index";
    }

    /**
     * Sets the "items" attribute with a collection of Salesterritoryhistory
     * entities that are retrieved from Salesterritory?cap_first and returns the
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
     * that are retrieved from Salesterritory?cap_first and returns the
     * navigation outcome.
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
