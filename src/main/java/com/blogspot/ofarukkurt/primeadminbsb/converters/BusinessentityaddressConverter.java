package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Businessentityaddress;
import com.blogspot.ofarukkurt.primeadminbsb.services.BusinessentityaddressFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "businessentityaddressConverter")
public class BusinessentityaddressConverter implements Converter {

    @Inject
    private BusinessentityaddressFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentityaddressPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentityaddressPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentityaddressPK();
            key.setBusinessEntityID(Integer.parseInt(values[0]));
            key.setAddressID(Integer.parseInt(values[1]));
            key.setAddressTypeID(Integer.parseInt(values[2]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentityaddressPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getBusinessEntityID());
            sb.append(SEPARATOR);
            sb.append(value.getAddressID());
            sb.append(SEPARATOR);
            sb.append(value.getAddressTypeID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Businessentityaddress) {
            Businessentityaddress o = (Businessentityaddress) object;
            return getStringKey(o.getBusinessentityaddressPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Businessentityaddress.class.getName()});
            return null;
        }
    }

}
