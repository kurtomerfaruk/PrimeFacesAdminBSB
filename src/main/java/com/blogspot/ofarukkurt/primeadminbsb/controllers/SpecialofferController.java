package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Specialoffer;
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

@Named(value = "specialofferController")
@ViewScoped
public class SpecialofferController extends AbstractController<Specialoffer> {

    private static final long serialVersionUID = 393566574836481553L;

    public SpecialofferController() {
        // Inform the Abstract parent controller of the concrete Specialoffer Entity
        super(Specialoffer.class);
    }

    /**
     * Sets the "items" attribute with a collection of Specialofferproduct
     * entities that are retrieved from Specialoffer?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Specialofferproduct page
     */
    public String navigateSpecialofferproductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Specialofferproduct_items", this.getSelected().getSpecialofferproductList());
        }
        return "/specialofferproduct/index";
    }

}
