package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productvendor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productvendorController")
@ViewScoped
public class ProductvendorController extends AbstractController<Productvendor> {
    private static final long serialVersionUID = 1704848336555166652L;

    public ProductvendorController() {
        // Inform the Abstract parent controller of the concrete Productvendor Entity
        super(Productvendor.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductvendorPK(new com.kurtomerfaruk.primeadminbsb.models.ProductvendorPK());
    }

}
