package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Employeepayhistory;
import com.blogspot.ofarukkurt.primeadminbsb.services.EmployeepayhistoryFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "employeepayhistoryConverter")
public class EmployeepayhistoryConverter implements Converter {

    @Inject
    private EmployeepayhistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK();
            key.setBusinessEntityID(Integer.parseInt(values[0]));
            key.setRateChangeDate(java.sql.Date.valueOf(values[1]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.EmployeepayhistoryPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getBusinessEntityID());
            sb.append(SEPARATOR);
            sb.append(value.getRateChangeDate());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Employeepayhistory) {
            Employeepayhistory o = (Employeepayhistory) object;
            return getStringKey(o.getEmployeepayhistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Employeepayhistory.class.getName()});
            return null;
        }
    }

}
