package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Addresstype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "addresstypeController")
@ViewScoped
public class AddresstypeController extends AbstractController<Addresstype> {
    private static final long serialVersionUID = -8896050561840828658L;

    public AddresstypeController() {
        // Inform the Abstract parent controller of the concrete Addresstype Entity
        super(Addresstype.class);
    }

}
