package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Culture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "cultureController")
@ViewScoped
public class CultureController extends AbstractController<Culture> {
    private static final long serialVersionUID = 6842371726662630733L;

    public CultureController() {
        // Inform the Abstract parent controller of the concrete Culture Entity
        super(Culture.class);
    }

}
