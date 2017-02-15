package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Workorder;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "workorderController")
@ViewScoped
public class WorkorderController extends AbstractController<Workorder> {
    private static final long serialVersionUID = 9088931224721887076L;

    public WorkorderController() {
        // Inform the Abstract parent controller of the concrete Workorder Entity
        super(Workorder.class);
    }

}
