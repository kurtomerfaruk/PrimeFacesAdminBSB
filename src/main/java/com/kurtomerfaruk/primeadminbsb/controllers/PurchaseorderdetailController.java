package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Purchaseorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "purchaseorderdetailController")
@ViewScoped
public class PurchaseorderdetailController extends AbstractController<Purchaseorderdetail> {

    public PurchaseorderdetailController() {
        // Inform the Abstract parent controller of the concrete Purchaseorderdetail Entity
        super(Purchaseorderdetail.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPurchaseorderdetailPK(new com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK());
    }

}
