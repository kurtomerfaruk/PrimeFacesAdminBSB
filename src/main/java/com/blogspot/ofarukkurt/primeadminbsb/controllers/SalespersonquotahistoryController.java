package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salespersonquotahistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "salespersonquotahistoryController")
@ViewScoped
public class SalespersonquotahistoryController extends AbstractController<Salespersonquotahistory> {

    private static final long serialVersionUID = -7134093326632165822L;

    @Inject
    private SalespersonController salespersonController;

    public SalespersonquotahistoryController() {
        // Inform the Abstract parent controller of the concrete Salespersonquotahistory Entity
        super(Salespersonquotahistory.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getSalespersonquotahistoryPK().setBusinessEntityID(this.getSelected().getSalesperson().getBusinessEntityID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalespersonquotahistoryPK(new com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        salespersonController.setSelected(null);
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
