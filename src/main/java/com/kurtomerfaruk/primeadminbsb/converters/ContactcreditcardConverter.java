package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Contactcreditcard;
import com.kurtomerfaruk.primeadminbsb.services.ContactcreditcardFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@FacesConverter(value = "contactcreditcardConverter")
public class ContactcreditcardConverter implements Converter {

    @Inject
    private ContactcreditcardFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK();
        key.setContactID(Integer.parseInt(values[0]));
        key.setCreditCardID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.ContactcreditcardPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getContactID());
        sb.append(SEPARATOR);
        sb.append(value.getCreditCardID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Contactcreditcard) {
            Contactcreditcard o = (Contactcreditcard) object;
            return getStringKey(o.getContactcreditcardPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Contactcreditcard.class.getName()});
            return null;
        }
    }

}
