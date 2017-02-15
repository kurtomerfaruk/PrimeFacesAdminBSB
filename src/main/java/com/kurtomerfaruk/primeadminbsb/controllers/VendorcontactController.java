package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Vendorcontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "vendorcontactController")
@ViewScoped
public class VendorcontactController extends AbstractController<Vendorcontact> {
    private static final long serialVersionUID = 3432914308538997731L;

    public VendorcontactController() {
        // Inform the Abstract parent controller of the concrete Vendorcontact Entity
        super(Vendorcontact.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setVendorcontactPK(new com.kurtomerfaruk.primeadminbsb.models.VendorcontactPK());
    }

}
