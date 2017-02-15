package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Illustration;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "illustrationController")
@ViewScoped
public class IllustrationController extends AbstractController<Illustration> {
    private static final long serialVersionUID = -8296637159604249573L;

    public IllustrationController() {
        // Inform the Abstract parent controller of the concrete Illustration Entity
        super(Illustration.class);
    }

}
