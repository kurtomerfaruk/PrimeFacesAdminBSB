package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelproductdescriptionculture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productmodelproductdescriptioncultureController")
@ViewScoped
public class ProductmodelproductdescriptioncultureController extends AbstractController<Productmodelproductdescriptionculture> {

    public ProductmodelproductdescriptioncultureController() {
        // Inform the Abstract parent controller of the concrete Productmodelproductdescriptionculture Entity
        super(Productmodelproductdescriptionculture.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelproductdescriptionculturePK(new com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK());
    }

}
