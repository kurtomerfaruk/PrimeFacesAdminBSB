package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Shift;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "shiftController")
@ViewScoped
public class ShiftController extends AbstractController<Shift> {
    private static final long serialVersionUID = -5426614251784591342L;

    public ShiftController() {
        // Inform the Abstract parent controller of the concrete Shift Entity
        super(Shift.class);
    }

}
