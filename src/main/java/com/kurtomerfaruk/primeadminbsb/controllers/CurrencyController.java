package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Currency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "currencyController")
@ViewScoped
public class CurrencyController extends AbstractController<Currency> {
    private static final long serialVersionUID = 8835694352036532315L;

    public CurrencyController() {
        // Inform the Abstract parent controller of the concrete Currency Entity
        super(Currency.class);
    }

}
