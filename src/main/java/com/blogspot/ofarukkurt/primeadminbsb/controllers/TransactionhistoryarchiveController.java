package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Transactionhistoryarchive;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "transactionhistoryarchiveController")
@ViewScoped
public class TransactionhistoryarchiveController extends AbstractController<Transactionhistoryarchive> {

    public TransactionhistoryarchiveController() {
        // Inform the Abstract parent controller of the concrete Transactionhistoryarchive Entity
        super(Transactionhistoryarchive.class);
    }

}
