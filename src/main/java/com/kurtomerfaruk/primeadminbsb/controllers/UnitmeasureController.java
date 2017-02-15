package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Unitmeasure;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "unitmeasureController")
@ViewScoped
public class UnitmeasureController extends AbstractController<Unitmeasure> {
    private static final long serialVersionUID = -5946359760391478118L;

    public UnitmeasureController() {
        // Inform the Abstract parent controller of the concrete Unitmeasure Entity
        super(Unitmeasure.class);
    }

}
