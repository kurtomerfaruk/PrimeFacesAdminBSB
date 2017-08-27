package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Workorder;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "workorderController")
@ViewScoped
public class WorkorderController extends AbstractController<Workorder> {

    @Inject
    private ScrapreasonController scrapReasonIDController;
    @Inject
    private ProductController productIDController;

    public WorkorderController() {
        // Inform the Abstract parent controller of the concrete Workorder Entity
        super(Workorder.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        scrapReasonIDController.setSelected(null);
        productIDController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Workorderrouting entities
     * that are retrieved from Workorder?cap_first and returns the navigation
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
     * Sets the "selected" attribute of the Scrapreason controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareScrapReasonID(ActionEvent event) {
        if (this.getSelected() != null && scrapReasonIDController.getSelected() == null) {
            scrapReasonIDController.setSelected(this.getSelected().getScrapReasonID());
        }
    }

    /**
     * Sets the "selected" attribute of the Product controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductID(ActionEvent event) {
        if (this.getSelected() != null && productIDController.getSelected() == null) {
            productIDController.setSelected(this.getSelected().getProductID());
        }
    }
}
