package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productdocument;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productdocumentController")
@ViewScoped
public class ProductdocumentController extends AbstractController<Productdocument> {
    private static final long serialVersionUID = 577072333444335669L;

    public ProductdocumentController() {
        // Inform the Abstract parent controller of the concrete Productdocument Entity
        super(Productdocument.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductdocumentPK(new com.kurtomerfaruk.primeadminbsb.models.ProductdocumentPK());
    }

}
