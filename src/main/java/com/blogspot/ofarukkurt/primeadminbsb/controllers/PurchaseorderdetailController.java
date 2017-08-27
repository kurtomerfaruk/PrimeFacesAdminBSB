package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Purchaseorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "purchaseorderdetailController")
@ViewScoped
public class PurchaseorderdetailController extends AbstractController<Purchaseorderdetail> {

    @Inject
    private PurchaseorderheaderController purchaseorderheaderController;
    @Inject
    private ProductController productIDController;

    public PurchaseorderdetailController() {
        // Inform the Abstract parent controller of the concrete Purchaseorderdetail Entity
        super(Purchaseorderdetail.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getPurchaseorderdetailPK().setPurchaseOrderID(this.getSelected().getPurchaseorderheader().getPurchaseOrderID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPurchaseorderdetailPK(new com.blogspot.ofarukkurt.primeadminbsb.models.PurchaseorderdetailPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        purchaseorderheaderController.setSelected(null);
        productIDController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Purchaseorderheader controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePurchaseorderheader(ActionEvent event) {
        if (this.getSelected() != null && purchaseorderheaderController.getSelected() == null) {
            purchaseorderheaderController.setSelected(this.getSelected().getPurchaseorderheader());
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
