package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productlistpricehistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productlistpricehistoryController")
@ViewScoped
public class ProductlistpricehistoryController extends AbstractController<Productlistpricehistory> {
    private static final long serialVersionUID = 2448637473272940817L;

    public ProductlistpricehistoryController() {
        // Inform the Abstract parent controller of the concrete Productlistpricehistory Entity
        super(Productlistpricehistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductlistpricehistoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductlistpricehistoryPK());
    }

}
