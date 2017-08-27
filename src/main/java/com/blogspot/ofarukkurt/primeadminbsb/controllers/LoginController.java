package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.Util;
import com.blogspot.ofarukkurt.primeadminbsb.models.Users;
import com.blogspot.ofarukkurt.primeadminbsb.services.UsersFacade;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 13/02/2017 12:18:26
 */
@ManagedBean
@SessionScoped
public class LoginController implements java.io.Serializable {

    private static final long serialVersionUID = -3754185141228965295L;

    @EJB
    private UsersFacade userService;

    private Users users;

    private String username;
    private String password;
    private boolean logged;

    public LoginController() {
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public void login() {
        try {
            if (!username.equals("") && !username.equals(null) && !password.equals("") && !password.equals(null)) {
                users = userService.userValid(username, password);
            }

            if (users != null) {
                logged = Boolean.TRUE;

                HttpSession session = Util.getSession();
                HttpServletRequest request = Util.getRequest();

                session.setAttribute("users", users);

                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            } else {
                JsfUtil.addExclamationMessage(ResourceBundle.getBundle("/messages").getString("usernameOrPasswordWrong"));
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/messages").getString("PersistenceErrorOccured"));
        }
    }

    public void logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        try {
            logged = false;
            users = null;
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
