package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Specialofferproduct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "specialofferproductController")
@ViewScoped
public class SpecialofferproductController extends AbstractController<Specialofferproduct> {
    private static final long serialVersionUID = 2178539168797276305L;

    public SpecialofferproductController() {
        // Inform the Abstract parent controller of the concrete Specialofferproduct Entity
        super(Specialofferproduct.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSpecialofferproductPK(new com.kurtomerfaruk.primeadminbsb.models.SpecialofferproductPK());
    }

}
