package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Specialoffer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "specialofferController")
@ViewScoped
public class SpecialofferController extends AbstractController<Specialoffer> {
    private static final long serialVersionUID = -1732827129082843208L;

    public SpecialofferController() {
        // Inform the Abstract parent controller of the concrete Specialoffer Entity
        super(Specialoffer.class);
    }

}
