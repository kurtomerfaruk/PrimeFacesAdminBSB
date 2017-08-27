package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Personphone;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personphoneController")
@ViewScoped
public class PersonphoneController extends AbstractController<Personphone> {

    @Inject
    private PhonenumbertypeController phonenumbertypeController;
    @Inject
    private PersonController personController;

    public PersonphoneController() {
        // Inform the Abstract parent controller of the concrete Personphone Entity
        super(Personphone.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getPersonphonePK().setBusinessEntityID(this.getSelected().getPerson().getBusinessEntityID());
        this.getSelected().getPersonphonePK().setPhoneNumberTypeID(this.getSelected().getPhonenumbertype().getPhoneNumberTypeID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPersonphonePK(new com.blogspot.ofarukkurt.primeadminbsb.models.PersonphonePK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        phonenumbertypeController.setSelected(null);
        personController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Phonenumbertype controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePhonenumbertype(ActionEvent event) {
        if (this.getSelected() != null && phonenumbertypeController.getSelected() == null) {
            phonenumbertypeController.setSelected(this.getSelected().getPhonenumbertype());
        }
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
