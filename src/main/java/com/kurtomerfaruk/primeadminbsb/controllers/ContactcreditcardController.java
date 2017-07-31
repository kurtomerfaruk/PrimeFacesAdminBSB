package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Contactcreditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "contactcreditcardController")
@ViewScoped
public class ContactcreditcardController extends AbstractController<Contactcreditcard> {
    private static final long serialVersionUID = 16146463433067863L;

    public ContactcreditcardController() {
        super(Contactcreditcard.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setContactcreditcardPK(new com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK());
    }

}
