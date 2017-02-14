package com.kurtomerfaruk.primeadminbsb.services;

import com.kurtomerfaruk.primeadminbsb.controllers.util.Functions;
import com.kurtomerfaruk.primeadminbsb.models.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * @Created on date 13/02/2017 09:19:27
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {
    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }

    public Users userValid(String username, String password) {
         try {
            return (Users) em.createNamedQuery("Users.findByUserNamePassword").setParameter("userName", username).setParameter("password", Functions.crypto(password)).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
