package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Awbuildversion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "awbuildversionController")
@ViewScoped
public class AwbuildversionController extends AbstractController<Awbuildversion> {

    public AwbuildversionController() {
        // Inform the Abstract parent controller of the concrete Awbuildversion Entity
        super(Awbuildversion.class);
    }

}
