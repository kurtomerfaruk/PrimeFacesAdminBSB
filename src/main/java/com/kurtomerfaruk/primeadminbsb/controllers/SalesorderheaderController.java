package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderheader;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesorderheaderController")
@ViewScoped
public class SalesorderheaderController extends AbstractController<Salesorderheader> {
    private static final long serialVersionUID = -4036174006358356856L;

    public SalesorderheaderController() {
        // Inform the Abstract parent controller of the concrete Salesorderheader Entity
        super(Salesorderheader.class);
    }

}
