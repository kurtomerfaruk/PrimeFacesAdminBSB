package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Location;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "locationController")
@ViewScoped
public class LocationController extends AbstractController<Location> {

    public LocationController() {
        // Inform the Abstract parent controller of the concrete Location Entity
        super(Location.class);
    }

    /**
     * Sets the "items" attribute with a collection of Workorderrouting entities
     * that are retrieved from Location?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Workorderrouting page
     */
    public String navigateWorkorderroutingList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Workorderrouting_items", this.getSelected().getWorkorderroutingList());
        }
        return "/workorderrouting/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productinventory entities
     * that are retrieved from Location?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productinventory page
     */
    public String navigateProductinventoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productinventory_items", this.getSelected().getProductinventoryList());
        }
        return "/productinventory/index";
    }

}
