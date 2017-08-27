package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Phonenumbertype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "phonenumbertypeController")
@ViewScoped
public class PhonenumbertypeController extends AbstractController<Phonenumbertype> {

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
