package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelillustration;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productmodelillustrationController")
@ViewScoped
public class ProductmodelillustrationController extends AbstractController<Productmodelillustration> {

    public ProductmodelillustrationController() {
        // Inform the Abstract parent controller of the concrete Productmodelillustration Entity
        super(Productmodelillustration.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelillustrationPK(new com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK());
    }

}
