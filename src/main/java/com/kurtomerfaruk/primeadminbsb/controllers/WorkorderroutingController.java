package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Workorderrouting;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "workorderroutingController")
@ViewScoped
public class WorkorderroutingController extends AbstractController<Workorderrouting> {
    private static final long serialVersionUID = -8866644163098259147L;

    public WorkorderroutingController() {
        // Inform the Abstract parent controller of the concrete Workorderrouting Entity
        super(Workorderrouting.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setWorkorderroutingPK(new com.kurtomerfaruk.primeadminbsb.models.WorkorderroutingPK());
    }

}
