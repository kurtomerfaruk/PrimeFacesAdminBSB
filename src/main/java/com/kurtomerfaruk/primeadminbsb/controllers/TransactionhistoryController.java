package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Transactionhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "transactionhistoryController")
@ViewScoped
public class TransactionhistoryController extends AbstractController<Transactionhistory> {

    public TransactionhistoryController() {
        // Inform the Abstract parent controller of the concrete Transactionhistory Entity
        super(Transactionhistory.class);
    }

}
