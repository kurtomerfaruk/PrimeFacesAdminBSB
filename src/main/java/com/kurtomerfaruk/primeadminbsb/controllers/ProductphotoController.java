package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productphoto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productphotoController")
@ViewScoped
public class ProductphotoController extends AbstractController<Productphoto> {
    private static final long serialVersionUID = -2574700692977233286L;

    public ProductphotoController() {
        // Inform the Abstract parent controller of the concrete Productphoto Entity
        super(Productphoto.class);
    }

}
