package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Employeedepartmenthistory;
import com.blogspot.ofarukkurt.primeadminbsb.services.EmployeedepartmenthistoryFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "employeedepartmenthistoryConverter")
public class EmployeedepartmenthistoryConverter implements Converter {

    @Inject
    private EmployeedepartmenthistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.EmployeedepartmenthistoryPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.EmployeedepartmenthistoryPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.blogspot.ofarukkurt.primeadminbsb.models.EmployeedepartmenthistoryPK();
        key.setBusinessEntityID(Integer.parseInt(values[0]));
        key.setDepartmentID(Short.parseShort(values[1]));
        key.setShiftID(Short.parseShort(values[2]));
        key.setStartDate(java.sql.Date.valueOf(values[3]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.EmployeedepartmenthistoryPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getBusinessEntityID());
        sb.append(SEPARATOR);
        sb.append(value.getDepartmentID());
        sb.append(SEPARATOR);
        sb.append(value.getShiftID());
        sb.append(SEPARATOR);
        sb.append(value.getStartDate());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Employeedepartmenthistory) {
            Employeedepartmenthistory o = (Employeedepartmenthistory) object;
            return getStringKey(o.getEmployeedepartmenthistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Employeedepartmenthistory.class.getName()});
            return null;
        }
    }

}
