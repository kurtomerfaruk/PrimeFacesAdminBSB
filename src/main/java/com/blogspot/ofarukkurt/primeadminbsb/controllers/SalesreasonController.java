package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salesreason;
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

@Named(value = "salesreasonController")
@ViewScoped
public class SalesreasonController extends AbstractController<Salesreason> {

    private static final long serialVersionUID = -2891329020726054365L;

    public SalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesreason Entity
        super(Salesreason.class);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Salesorderheadersalesreason entities that are retrieved from
     * Salesreason?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Salesorderheadersalesreason page
     */
    public String navigateSalesorderheadersalesreasonList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderheadersalesreason_items", this.getSelected().getSalesorderheadersalesreasonList());
        }
        return "/salesorderheadersalesreason/index";
    }

}
