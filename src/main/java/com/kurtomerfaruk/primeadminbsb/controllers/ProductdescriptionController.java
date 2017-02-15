package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productdescription;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productdescriptionController")
@ViewScoped
public class ProductdescriptionController extends AbstractController<Productdescription> {
    private static final long serialVersionUID = 4391037895158673497L;

    public ProductdescriptionController() {
        // Inform the Abstract parent controller of the concrete Productdescription Entity
        super(Productdescription.class);
    }

}
