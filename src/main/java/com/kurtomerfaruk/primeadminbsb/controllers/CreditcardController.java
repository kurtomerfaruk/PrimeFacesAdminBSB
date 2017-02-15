package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Creditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "creditcardController")
@ViewScoped
public class CreditcardController extends AbstractController<Creditcard> {
    private static final long serialVersionUID = -6736717821143180872L;

    public CreditcardController() {
        // Inform the Abstract parent controller of the concrete Creditcard Entity
        super(Creditcard.class);
    }

}
