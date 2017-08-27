package com.blogspot.ofarukkurt.primeadminbsb.listeners;

import com.blogspot.ofarukkurt.primeadminbsb.models.Users;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 15/02/2017 10:41:04
 */
public class SessionListeners implements HttpSessionListener, java.io.Serializable {

    private static final long serialVersionUID = 2813211470751882303L;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session created : " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        Users user = (Users) session.getAttribute("users");

        if (user != null) {
            System.out.println("login user :" + user.getUserName());
        }

        System.out.println("session destroyed :" + session.getId() + " Logging out user...");
    }
}
