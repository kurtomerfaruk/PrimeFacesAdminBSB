/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.services;

import com.kurtomerfaruk.primeadminbsb.models.Vendoraddress;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:13:30
 */
@Stateless
public class VendoraddressFacade extends AbstractFacade<Vendoraddress> {

    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VendoraddressFacade() {
        super(Vendoraddress.class);
    }

}
