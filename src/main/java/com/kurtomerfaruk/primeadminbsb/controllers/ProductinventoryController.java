package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productinventory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productinventoryController")
@ViewScoped
public class ProductinventoryController extends AbstractController<Productinventory> {
    private static final long serialVersionUID = -5573659950879045526L;

    public ProductinventoryController() {
        // Inform the Abstract parent controller of the concrete Productinventory Entity
        super(Productinventory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductinventoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK());
    }

}
