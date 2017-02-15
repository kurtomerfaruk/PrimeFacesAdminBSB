package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodel;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productmodelController")
@ViewScoped
public class ProductmodelController extends AbstractController<Productmodel> {
    private static final long serialVersionUID = -4327680896848235162L;

    public ProductmodelController() {
        // Inform the Abstract parent controller of the concrete Productmodel Entity
        super(Productmodel.class);
    }

}
