package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Billofmaterials;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "billofmaterialsController")
@ViewScoped
public class BillofmaterialsController extends AbstractController<Billofmaterials> {
    private static final long serialVersionUID = 7158907767797625241L;

    public BillofmaterialsController() {
        // Inform the Abstract parent controller of the concrete Billofmaterials Entity
        super(Billofmaterials.class);
    }

}
