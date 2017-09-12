package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Transactionhistoryarchive;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "transactionhistoryarchiveController")
@ViewScoped
public class TransactionhistoryarchiveController extends AbstractController<Transactionhistoryarchive> {

    private static final long serialVersionUID = 483599412261524592L;

    public TransactionhistoryarchiveController() {
        // Inform the Abstract parent controller of the concrete Transactionhistoryarchive Entity
        super(Transactionhistoryarchive.class);
    }

}
