package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderheader;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesorderheaderController")
@ViewScoped
public class SalesorderheaderController extends AbstractController<Salesorderheader> {

    public SalesorderheaderController() {
        // Inform the Abstract parent controller of the concrete Salesorderheader Entity
        super(Salesorderheader.class);
    }

}
