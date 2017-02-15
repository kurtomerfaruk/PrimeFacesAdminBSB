package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Vendor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "vendorController")
@ViewScoped
public class VendorController extends AbstractController<Vendor> {
    private static final long serialVersionUID = 7040676488896855412L;

    public VendorController() {
        // Inform the Abstract parent controller of the concrete Vendor Entity
        super(Vendor.class);
    }

}
