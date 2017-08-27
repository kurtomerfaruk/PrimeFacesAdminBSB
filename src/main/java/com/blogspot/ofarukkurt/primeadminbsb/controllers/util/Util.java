package com.blogspot.ofarukkurt.primeadminbsb.controllers.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 14/02/2017 08:51:25
 */
public class Util {

    /**
     *
     * @return
     */
    public static HttpSession getSession() {
        return (HttpSession) FacesContext.
                getCurrentInstance().
                getExternalContext().
                getSession(false);
    }

    /**
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.
                getCurrentInstance().
                getExternalContext().getRequest();
    }

}
