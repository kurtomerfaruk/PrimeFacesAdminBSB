package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Vendorcontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "vendorcontactController")
@ViewScoped
public class VendorcontactController extends AbstractController<Vendorcontact> {

    public VendorcontactController() {
        // Inform the Abstract parent controller of the concrete Vendorcontact Entity
        super(Vendorcontact.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setVendorcontactPK(new com.kurtomerfaruk.primeadminbsb.models.VendorcontactPK());
    }

}
