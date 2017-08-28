package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productphoto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "productphotoController")
@ViewScoped
public class ProductphotoController extends AbstractController<Productphoto> {

    public ProductphotoController() {
        // Inform the Abstract parent controller of the concrete Productphoto Entity
        super(Productphoto.class);
    }

    /**
     * Sets the "items" attribute with a collection of Productproductphoto
     * entities that are retrieved from Productphoto?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productproductphoto page
     */
    public String navigateProductproductphotoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productproductphoto_items", this.getSelected().getProductproductphotoList());
        }
        return "/productproductphoto/index";
    }

}
