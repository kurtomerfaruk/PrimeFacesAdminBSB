package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Phonenumbertype;
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

@Named(value = "phonenumbertypeController")
@ViewScoped
public class PhonenumbertypeController extends AbstractController<Phonenumbertype> {

    private static final long serialVersionUID = 4240653831639442171L;

    public PhonenumbertypeController() {
        // Inform the Abstract parent controller of the concrete Phonenumbertype Entity
        super(Phonenumbertype.class);
    }

    /**
     * Sets the "items" attribute with a collection of Personphone entities that
     * are retrieved from Phonenumbertype?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Personphone page
     */
    public String navigatePersonphoneList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Personphone_items", this.getSelected().getPersonphoneList());
        }
        return "/personphone/index";
    }

}
