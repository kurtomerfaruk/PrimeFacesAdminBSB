package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productcosthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productcosthistoryController")
@ViewScoped
public class ProductcosthistoryController extends AbstractController<Productcosthistory> {
    private static final long serialVersionUID = -7660143116586341401L;

    public ProductcosthistoryController() {
        // Inform the Abstract parent controller of the concrete Productcosthistory Entity
        super(Productcosthistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductcosthistoryPK(new com.kurtomerfaruk.primeadminbsb.models.ProductcosthistoryPK());
    }

}
