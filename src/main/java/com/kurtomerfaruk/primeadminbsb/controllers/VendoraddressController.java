package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Vendoraddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "vendoraddressController")
@ViewScoped
public class VendoraddressController extends AbstractController<Vendoraddress> {
    private static final long serialVersionUID = 770220890602617915L;

    public VendoraddressController() {
        // Inform the Abstract parent controller of the concrete Vendoraddress Entity
        super(Vendoraddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setVendoraddressPK(new com.kurtomerfaruk.primeadminbsb.models.VendoraddressPK());
    }

}
