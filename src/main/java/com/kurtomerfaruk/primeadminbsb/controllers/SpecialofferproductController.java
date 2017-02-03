package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Specialofferproduct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "specialofferproductController")
@ViewScoped
public class SpecialofferproductController extends AbstractController<Specialofferproduct> {

    public SpecialofferproductController() {
        // Inform the Abstract parent controller of the concrete Specialofferproduct Entity
        super(Specialofferproduct.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSpecialofferproductPK(new com.kurtomerfaruk.primeadminbsb.models.SpecialofferproductPK());
    }

}
