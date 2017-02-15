package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Customeraddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "customeraddressController")
@ViewScoped
public class CustomeraddressController extends AbstractController<Customeraddress> {
    private static final long serialVersionUID = -2657346795678285975L;

    public CustomeraddressController() {
        // Inform the Abstract parent controller of the concrete Customeraddress Entity
        super(Customeraddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setCustomeraddressPK(new com.kurtomerfaruk.primeadminbsb.models.CustomeraddressPK());
    }

}
