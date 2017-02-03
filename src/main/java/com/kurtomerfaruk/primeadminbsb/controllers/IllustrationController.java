package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Illustration;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "illustrationController")
@ViewScoped
public class IllustrationController extends AbstractController<Illustration> {

    public IllustrationController() {
        // Inform the Abstract parent controller of the concrete Illustration Entity
        super(Illustration.class);
    }

}
