package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Scrapreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "scrapreasonController")
@ViewScoped
public class ScrapreasonController extends AbstractController<Scrapreason> {
    private static final long serialVersionUID = 7830855474400367499L;

    public ScrapreasonController() {
        // Inform the Abstract parent controller of the concrete Scrapreason Entity
        super(Scrapreason.class);
    }

}
