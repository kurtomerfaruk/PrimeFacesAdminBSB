package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productproductphoto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productproductphotoController")
@ViewScoped
public class ProductproductphotoController extends AbstractController<Productproductphoto> {
    private static final long serialVersionUID = -4527908952790820247L;

    public ProductproductphotoController() {
        // Inform the Abstract parent controller of the concrete Productproductphoto Entity
        super(Productproductphoto.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductproductphotoPK(new com.kurtomerfaruk.primeadminbsb.models.ProductproductphotoPK());
    }

}
