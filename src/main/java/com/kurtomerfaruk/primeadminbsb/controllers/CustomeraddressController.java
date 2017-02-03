package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Customeraddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "customeraddressController")
@ViewScoped
public class CustomeraddressController extends AbstractController<Customeraddress> {

    public CustomeraddressController() {
        // Inform the Abstract parent controller of the concrete Customeraddress Entity
        super(Customeraddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setCustomeraddressPK(new com.kurtomerfaruk.primeadminbsb.models.CustomeraddressPK());
    }

}
