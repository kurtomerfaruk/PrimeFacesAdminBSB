package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Scrapreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:20 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "scrapreasonController")
@ViewScoped
public class ScrapreasonController extends AbstractController<Scrapreason> {

    private static final long serialVersionUID = -7303962943258447746L;

    public ScrapreasonController() {
        // Inform the Abstract parent controller of the concrete Scrapreason Entity
        super(Scrapreason.class);
    }

    /**
     * Sets the "items" attribute with a collection of Workorder entities that
     * are retrieved from Scrapreason?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Workorder page
     */
    public String navigateWorkorderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Workorder_items", this.getSelected().getWorkorderList());
        }
        return "/workorder/index";
    }

}
