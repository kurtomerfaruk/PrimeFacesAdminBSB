package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Address;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com Created on date 27.01.2017 23:11:05
 */
@Named(value = "addressController")
@ViewScoped
public class AddressController extends AbstractController<Address> {

    private static final long serialVersionUID = 8199558404244466831L;

    public AddressController() {
        // Inform the Abstract parent controller of the concrete Address Entity
        super(Address.class);
    }

}
