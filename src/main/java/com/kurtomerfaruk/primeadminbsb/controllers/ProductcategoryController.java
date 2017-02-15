package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productcategoryController")
@ViewScoped
public class ProductcategoryController extends AbstractController<Productcategory> {
    private static final long serialVersionUID = 4078155425531227720L;

    public ProductcategoryController() {
        // Inform the Abstract parent controller of the concrete Productcategory Entity
        super(Productcategory.class);
    }

}
