package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Emailaddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "emailaddressController")
@ViewScoped
public class EmailaddressController extends AbstractController<Emailaddress> {

    @Inject
    private PersonController personController;

    public EmailaddressController() {
        // Inform the Abstract parent controller of the concrete Emailaddress Entity
        super(Emailaddress.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getEmailaddressPK().setBusinessEntityID(this.getSelected().getPerson().getBusinessEntityID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmailaddressPK(new com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        personController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Person controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePerson(ActionEvent event) {
        if (this.getSelected() != null && personController.getSelected() == null) {
            personController.setSelected(this.getSelected().getPerson());
        }
    }
}
