package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Culture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "cultureController")
@ViewScoped
public class CultureController extends AbstractController<Culture> {

    private static final long serialVersionUID = 7325172819749776330L;
    
    @Inject
    private MenuController menuController;

    public CultureController() {
        // Inform the Abstract parent controller of the concrete Culture Entity
        super(Culture.class);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Productmodelproductdescriptionculture entities that are retrieved from
     * Culture?cap_first and returns the navigation outcome.
     *
     */
    public void navigateProductmodelproductdescriptioncultureList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productmodelproductdescriptionculture_items", this.getSelected().getProductmodelproductdescriptioncultureList());
        }
        menuController.setPageLink("/productmodelproductdescriptionculture/index");
    }

}
