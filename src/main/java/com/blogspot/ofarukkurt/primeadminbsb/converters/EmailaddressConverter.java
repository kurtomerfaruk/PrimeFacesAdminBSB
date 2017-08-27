package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Emailaddress;
import com.blogspot.ofarukkurt.primeadminbsb.services.EmailaddressFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "emailaddressConverter")
public class EmailaddressConverter implements Converter {

    @Inject
    private EmailaddressFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK();
        key.setBusinessEntityID(Integer.parseInt(values[0]));
        key.setEmailAddressID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.EmailaddressPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getBusinessEntityID());
        sb.append(SEPARATOR);
        sb.append(value.getEmailAddressID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Emailaddress) {
            Emailaddress o = (Emailaddress) object;
            return getStringKey(o.getEmailaddressPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Emailaddress.class.getName()});
            return null;
        }
    }

}
