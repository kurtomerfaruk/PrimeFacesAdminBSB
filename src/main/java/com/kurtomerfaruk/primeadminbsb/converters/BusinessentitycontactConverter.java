package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Businessentitycontact;
import com.kurtomerfaruk.primeadminbsb.services.BusinessentitycontactFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "businessentitycontactConverter")
public class BusinessentitycontactConverter implements Converter {

    @Inject
    private BusinessentitycontactFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.BusinessentitycontactPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.BusinessentitycontactPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.kurtomerfaruk.primeadminbsb.models.BusinessentitycontactPK();
            key.setBusinessEntityID(Integer.parseInt(values[0]));
            key.setPersonID(Integer.parseInt(values[1]));
            key.setContactTypeID(Integer.parseInt(values[2]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.BusinessentitycontactPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getBusinessEntityID());
            sb.append(SEPARATOR);
            sb.append(value.getPersonID());
            sb.append(SEPARATOR);
            sb.append(value.getContactTypeID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Businessentitycontact) {
            Businessentitycontact o = (Businessentitycontact) object;
            return getStringKey(o.getBusinessentitycontactPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Businessentitycontact.class.getName()});
            return null;
        }
    }

}
