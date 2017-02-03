/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.services;

import com.kurtomerfaruk.primeadminbsb.models.Specialofferproduct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:13:24
 */
@Stateless
public class SpecialofferproductFacade extends AbstractFacade<Specialofferproduct> {

    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpecialofferproductFacade() {
        super(Specialofferproduct.class);
    }

}
