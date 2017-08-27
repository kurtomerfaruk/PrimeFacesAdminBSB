package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Personcreditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "personcreditcardController")
@ViewScoped
public class PersoncreditcardController extends AbstractController<Personcreditcard> {

    @Inject
    private PersonController personController;
    @Inject
    private CreditcardController creditcardController;

    public PersoncreditcardController() {
        // Inform the Abstract parent controller of the concrete Personcreditcard Entity
        super(Personcreditcard.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getPersoncreditcardPK().setBusinessEntityID(this.getSelected().getPerson().getBusinessEntityID());
        this.getSelected().getPersoncreditcardPK().setCreditCardID(this.getSelected().getCreditcard().getCreditCardID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPersoncreditcardPK(new com.blogspot.ofarukkurt.primeadminbsb.models.PersoncreditcardPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        personController.setSelected(null);
        creditcardController.setSelected(null);
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

    /**
     * Sets the "selected" attribute of the Creditcard controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCreditcard(ActionEvent event) {
        if (this.getSelected() != null && creditcardController.getSelected() == null) {
            creditcardController.setSelected(this.getSelected().getCreditcard());
        }
    }
}
