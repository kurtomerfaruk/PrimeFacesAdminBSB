package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Individual;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "individualController")
@ViewScoped
public class IndividualController extends AbstractController<Individual> {
    private static final long serialVersionUID = -6331745122033895411L;

    public IndividualController() {
        // Inform the Abstract parent controller of the concrete Individual Entity
        super(Individual.class);
    }

}
