package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelproductdescriptionculture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productmodelproductdescriptioncultureController")
@ViewScoped
public class ProductmodelproductdescriptioncultureController extends AbstractController<Productmodelproductdescriptionculture> {
    private static final long serialVersionUID = 4545996383133053169L;

    public ProductmodelproductdescriptioncultureController() {
        // Inform the Abstract parent controller of the concrete Productmodelproductdescriptionculture Entity
        super(Productmodelproductdescriptionculture.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelproductdescriptionculturePK(new com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK());
    }

}
