package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderheadersalesreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesorderheadersalesreasonController")
@ViewScoped
public class SalesorderheadersalesreasonController extends AbstractController<Salesorderheadersalesreason> {
    private static final long serialVersionUID = -912310041698350614L;

    public SalesorderheadersalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesorderheadersalesreason Entity
        super(Salesorderheadersalesreason.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderheadersalesreasonPK(new com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK());
    }

}
