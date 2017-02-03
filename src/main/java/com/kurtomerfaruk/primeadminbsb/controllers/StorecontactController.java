package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Storecontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "storecontactController")
@ViewScoped
public class StorecontactController extends AbstractController<Storecontact> {

    public StorecontactController() {
        // Inform the Abstract parent controller of the concrete Storecontact Entity
        super(Storecontact.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setStorecontactPK(new com.kurtomerfaruk.primeadminbsb.models.StorecontactPK());
    }

}
