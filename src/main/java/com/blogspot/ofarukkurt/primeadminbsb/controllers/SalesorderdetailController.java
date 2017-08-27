package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "salesorderdetailController")
@ViewScoped
public class SalesorderdetailController extends AbstractController<Salesorderdetail> {

    @Inject
    private SpecialofferproductController specialofferproductController;
    @Inject
    private SalesorderheaderController salesorderheaderController;

    public SalesorderdetailController() {
        // Inform the Abstract parent controller of the concrete Salesorderdetail Entity
        super(Salesorderdetail.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getSalesorderdetailPK().setSalesOrderID(this.getSelected().getSalesorderheader().getSalesOrderID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderdetailPK(new com.blogspot.ofarukkurt.primeadminbsb.models.SalesorderdetailPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        specialofferproductController.setSelected(null);
        salesorderheaderController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Specialofferproduct controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSpecialofferproduct(ActionEvent event) {
        if (this.getSelected() != null && specialofferproductController.getSelected() == null) {
            specialofferproductController.setSelected(this.getSelected().getSpecialofferproduct());
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
