package com.blogspot.ofarukkurt.primeadminbsb.services;

import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import com.blogspot.ofarukkurt.primeadminbsb.models.Menu;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 27.01.2017 23:11:05
 */
@Stateless
public class MenuFacade extends AbstractFacade<Menu> {

    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuFacade() {
        super(Menu.class);
    }

    public List<Menu> getTopMenuList() {
        return getEntityManager().createNamedQuery("Menu.findByMenuType").getResultList();
    }

    public List<Menu> searchMenuList(String text) {
        try {
            return getEntityManager().createNamedQuery("Menu.findByMenuName").setParameter("menuName", "%"+text+"%").getResultList();
        } catch (NoResultException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/messages").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public Menu getTopMenu(Integer topMenuId) {
         try {
            return (Menu) getEntityManager().createNamedQuery("Menu.findByMenuId").setParameter("menuId", topMenuId).getSingleResult();
        } catch (NoResultException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/messages").getString("PersistenceErrorOccured"));
            return null;
        }
    }
    
    @Override
    public List<Menu> findAll() {
        return getEntityManager().createNamedQuery("Menu.findAll").getResultList();
    }

}
