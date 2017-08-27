package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Salespersonquotahistory;
import com.blogspot.ofarukkurt.primeadminbsb.services.SalespersonquotahistoryFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "salespersonquotahistoryConverter")
public class SalespersonquotahistoryConverter implements Converter {

    @Inject
    private SalespersonquotahistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK();
            key.setBusinessEntityID(Integer.parseInt(values[0]));
            key.setQuotaDate(java.sql.Date.valueOf(values[1]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.SalespersonquotahistoryPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getBusinessEntityID());
            sb.append(SEPARATOR);
            sb.append(value.getQuotaDate());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Salespersonquotahistory) {
            Salespersonquotahistory o = (Salespersonquotahistory) object;
            return getStringKey(o.getSalespersonquotahistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Salespersonquotahistory.class.getName()});
            return null;
        }
    }

}
