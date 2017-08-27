package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Stateprovince;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "stateprovinceController")
@ViewScoped
public class StateprovinceController extends AbstractController<Stateprovince> {

    @Inject
    private SalesterritoryController territoryIDController;
    @Inject
    private CountryregionController countryRegionCodeController;

    public StateprovinceController() {
        // Inform the Abstract parent controller of the concrete Stateprovince Entity
        super(Stateprovince.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        territoryIDController.setSelected(null);
        countryRegionCodeController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Salestaxrate entities
     * that are retrieved from Stateprovince?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Salestaxrate page
     */
    public String navigateSalestaxrateList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salestaxrate_items", this.getSelected().getSalestaxrateList());
        }
        return "/salestaxrate/index";
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
     * Sets the "items" attribute with a collection of Address entities that are
     * retrieved from Stateprovince?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Address page
     */
    public String navigateAddressList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Address_items", this.getSelected().getAddressList());
        }
        return "/address/index";
    }

}
