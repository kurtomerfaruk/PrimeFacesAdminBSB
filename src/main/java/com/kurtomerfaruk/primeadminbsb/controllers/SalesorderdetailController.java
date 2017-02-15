package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "salesorderdetailController")
@ViewScoped
public class SalesorderdetailController extends AbstractController<Salesorderdetail> {
    private static final long serialVersionUID = 6466103251999912851L;

    public SalesorderdetailController() {
        // Inform the Abstract parent controller of the concrete Salesorderdetail Entity
        super(Salesorderdetail.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesorderdetailPK(new com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK());
    }

}
