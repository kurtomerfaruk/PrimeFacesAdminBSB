package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Countryregion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "countryregionController")
@ViewScoped
public class CountryregionController extends AbstractController<Countryregion> {

    private static final long serialVersionUID = 5318726357845727032L;
    
    @Inject
    private MenuController menuController;

    public CountryregionController() {
        // Inform the Abstract parent controller of the concrete Countryregion Entity
        super(Countryregion.class);
    }

    /**
     * Sets the "items" attribute with a collection of Salesterritory entities
     * that are retrieved from Countryregion?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateSalesterritoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesterritory_items", this.getSelected().getSalesterritoryList());
        }
        menuController.setPageLink("/salesterritory/index");
    }

    /**
     * Sets the "items" attribute with a collection of Countryregioncurrency
     * entities that are retrieved from Countryregion?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateCountryregioncurrencyList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Countryregioncurrency_items", this.getSelected().getCountryregioncurrencyList());
        }
        menuController.setPageLink("/countryregioncurrency/index");
    }

    /**
     * Sets the "items" attribute with a collection of Stateprovince entities
     * that are retrieved from Countryregion?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateStateprovinceList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Stateprovince_items", this.getSelected().getStateprovinceList());
        }
        menuController.setPageLink("/stateprovince/index");
    }

}
