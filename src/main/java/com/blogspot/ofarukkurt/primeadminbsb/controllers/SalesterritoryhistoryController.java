package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesterritoryhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salesterritoryhistoryController")
@ViewScoped
public class SalesterritoryhistoryController extends AbstractController<Salesterritoryhistory> {

    @Inject
    private SalesterritoryController salesterritoryController;
    @Inject
    private SalespersonController salespersonController;

    public SalesterritoryhistoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritoryhistory Entity
        super(Salesterritoryhistory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getSalesterritoryhistoryPK().setBusinessEntityID(this.getSelected().getSalesperson().getBusinessEntityID());
        this.getSelected().getSalesterritoryhistoryPK().setTerritoryID(this.getSelected().getSalesterritory().getTerritoryID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesterritoryhistoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.SalesterritoryhistoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        salesterritoryController.setSelected(null);
        salespersonController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Salesterritory controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSalesterritory(ActionEvent event) {
        if (this.getSelected() != null && salesterritoryController.getSelected() == null) {
            salesterritoryController.setSelected(this.getSelected().getSalesterritory());
        }
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
}
