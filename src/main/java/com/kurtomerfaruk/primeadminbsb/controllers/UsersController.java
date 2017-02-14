package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.controllers.util.Functions;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import com.kurtomerfaruk.primeadminbsb.models.Users;
import com.kurtomerfaruk.primeadminbsb.services.UsersFacade;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * @Created on date 27.01.2017 23:11:05
 */
@Named(value = "usersController")
@ViewScoped
public class UsersController extends AbstractController<Users> {

    private static final long serialVersionUID = 1352784463943112254L;

    @EJB
    private UsersFacade userService;

    private String oldPassword;
    private String newPassword;
    private String newPassword2;

    public UsersController() {
        // Inform the Abstract parent controller of the concrete Users Entity
        super(Users.class);
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword2() {
        return newPassword2;
    }

    public void setNewPassword2(String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    public void passwordUpdate(ActionEvent event) {
        if (this.getSelected() != null) {
            Users user = userService.find(this.getSelected().getUserId());
            if (user != null) {

                if (!user.getPassword().equals(Functions.crypto(oldPassword))) {
                    JsfUtil.addExclamationMessage("Password do not match");
                } else {
                    this.getSelected().setPassword(Functions.crypto(newPassword));
                    this.save(event);
                }
            }
        }
    }
    
    public void saveNewPassword(ActionEvent event){
        if(this.getSelected()!=null){
            this.getSelected().setPassword(Functions.crypto(this.getSelected().getPassword()));
            this.saveNew(event);
        }
    }

}
