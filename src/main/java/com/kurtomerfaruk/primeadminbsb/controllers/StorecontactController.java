package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Storecontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "storecontactController")
@ViewScoped
public class StorecontactController extends AbstractController<Storecontact> {
    private static final long serialVersionUID = 1772545150223592529L;

    public StorecontactController() {
        // Inform the Abstract parent controller of the concrete Storecontact Entity
        super(Storecontact.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setStorecontactPK(new com.kurtomerfaruk.primeadminbsb.models.StorecontactPK());
    }

}
