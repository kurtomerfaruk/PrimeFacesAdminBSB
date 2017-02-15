package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Location;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "locationController")
@ViewScoped
public class LocationController extends AbstractController<Location> {
    private static final long serialVersionUID = -1552597340315653547L;

    public LocationController() {
        // Inform the Abstract parent controller of the concrete Location Entity
        super(Location.class);
    }

}
