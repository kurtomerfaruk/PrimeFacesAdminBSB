package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelillustration;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productmodelillustrationController")
@ViewScoped
public class ProductmodelillustrationController extends AbstractController<Productmodelillustration> {
    private static final long serialVersionUID = -8577465356616206724L;

    public ProductmodelillustrationController() {
        // Inform the Abstract parent controller of the concrete Productmodelillustration Entity
        super(Productmodelillustration.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelillustrationPK(new com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK());
    }

}
