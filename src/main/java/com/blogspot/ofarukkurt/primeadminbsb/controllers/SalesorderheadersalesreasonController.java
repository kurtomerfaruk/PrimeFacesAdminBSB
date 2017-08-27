package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderheadersalesreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salesorderheadersalesreasonController")
@ViewScoped
public class SalesorderheadersalesreasonController extends AbstractController<Salesorderheadersalesreason> {

    @Inject
    private SalesreasonController salesreasonController;
    @Inject
    private SalesorderheaderController salesorderheaderController;

    public SalesorderheadersalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesorderheadersalesreason Entity
        super(Salesorderheadersalesreason.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getSalesorderheadersalesreasonPK().setSalesOrderID(this.getSelected().getSalesorderheader().getSalesOrderID());
        this.getSelected().getSalesorderheadersalesreasonPK().setSalesReasonID(this.getSelected().getSalesreason().getSalesReasonID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderheadersalesreasonPK(new com.blogspot.ofarukkurt.primeadminbsb.models.SalesorderheadersalesreasonPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        salesreasonController.setSelected(null);
        salesorderheaderController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Salesreason controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSalesreason(ActionEvent event) {
        if (this.getSelected() != null && salesreasonController.getSelected() == null) {
            salesreasonController.setSelected(this.getSelected().getSalesreason());
        }
    }

    /**
     * Sets the "selected" attribute of the Salesorderheader controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSalesorderheader(ActionEvent event) {
        if (this.getSelected() != null && salesorderheaderController.getSelected() == null) {
            salesorderheaderController.setSelected(this.getSelected().getSalesorderheader());
        }
    }
}
