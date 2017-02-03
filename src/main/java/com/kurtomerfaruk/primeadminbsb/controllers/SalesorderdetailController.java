package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesorderdetailController")
@ViewScoped
public class SalesorderdetailController extends AbstractController<Salesorderdetail> {

    public SalesorderdetailController() {
        // Inform the Abstract parent controller of the concrete Salesorderdetail Entity
        super(Salesorderdetail.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderdetailPK(new com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK());
    }

}
