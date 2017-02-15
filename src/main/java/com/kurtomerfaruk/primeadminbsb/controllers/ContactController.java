package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Contact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "contactController")
@ViewScoped
public class ContactController extends AbstractController<Contact> {
    private static final long serialVersionUID = -94945998912029354L;

    public ContactController() {
        // Inform the Abstract parent controller of the concrete Contact Entity
        super(Contact.class);
    }

}
