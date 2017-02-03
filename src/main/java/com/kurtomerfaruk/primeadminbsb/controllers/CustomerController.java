package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Customer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "customerController")
@ViewScoped
public class CustomerController extends AbstractController<Customer> {

    public CustomerController() {
        // Inform the Abstract parent controller of the concrete Customer Entity
        super(Customer.class);
    }

}
