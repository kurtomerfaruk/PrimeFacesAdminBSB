package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Users;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usersController")
@ViewScoped
public class UsersController extends AbstractController<Users> {

    public UsersController() {
        // Inform the Abstract parent controller of the concrete Users Entity
        super(Users.class);
    }

}
