package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productsubcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productsubcategoryController")
@ViewScoped
public class ProductsubcategoryController extends AbstractController<Productsubcategory> {
    private static final long serialVersionUID = -5066119539215606949L;

    public ProductsubcategoryController() {
        // Inform the Abstract parent controller of the concrete Productsubcategory Entity
        super(Productsubcategory.class);
    }

}
