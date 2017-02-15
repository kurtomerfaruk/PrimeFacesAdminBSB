package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Contacttype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "contacttypeController")
@ViewScoped
public class ContacttypeController extends AbstractController<Contacttype> {
    private static final long serialVersionUID = -3571931622043412377L;

    public ContacttypeController() {
        // Inform the Abstract parent controller of the concrete Contacttype Entity
        super(Contacttype.class);
    }

}
