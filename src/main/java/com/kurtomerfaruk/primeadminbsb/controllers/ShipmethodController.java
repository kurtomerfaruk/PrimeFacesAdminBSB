package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Shipmethod;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "shipmethodController")
@ViewScoped
public class ShipmethodController extends AbstractController<Shipmethod> {
    private static final long serialVersionUID = -5596790631336657414L;

    public ShipmethodController() {
        // Inform the Abstract parent controller of the concrete Shipmethod Entity
        super(Shipmethod.class);
    }

}
