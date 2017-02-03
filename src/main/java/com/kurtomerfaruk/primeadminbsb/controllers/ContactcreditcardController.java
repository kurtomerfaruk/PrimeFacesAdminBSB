package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Contactcreditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "contactcreditcardController")
@ViewScoped
public class ContactcreditcardController extends AbstractController<Contactcreditcard> {

    public ContactcreditcardController() {
        // Inform the Abstract parent controller of the concrete Contactcreditcard Entity
        super(Contactcreditcard.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setContactcreditcardPK(new com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK());
    }

}
