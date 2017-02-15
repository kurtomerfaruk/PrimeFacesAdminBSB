package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Awbuildversion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "awbuildversionController")
@ViewScoped
public class AwbuildversionController extends AbstractController<Awbuildversion> {
    private static final long serialVersionUID = -5046449221156955747L;

    public AwbuildversionController() {
        // Inform the Abstract parent controller of the concrete Awbuildversion Entity
        super(Awbuildversion.class);
    }

}
