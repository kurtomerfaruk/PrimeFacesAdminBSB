package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Purchaseorderdetail;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "purchaseorderdetailController")
@ViewScoped
public class PurchaseorderdetailController extends AbstractController<Purchaseorderdetail> {
    private static final long serialVersionUID = -4077632728465682169L;

    public PurchaseorderdetailController() {
        // Inform the Abstract parent controller of the concrete Purchaseorderdetail Entity
        super(Purchaseorderdetail.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setPurchaseorderdetailPK(new com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK());
    }

}
