package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Salesterritoryhistory;
import com.kurtomerfaruk.primeadminbsb.services.SalesterritoryhistoryFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "salesterritoryhistoryConverter")
public class SalesterritoryhistoryConverter implements Converter {

    @Inject
    private SalesterritoryhistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK();
            key.setBusinessEntityID(Integer.parseInt(values[0]));
            key.setTerritoryID(Integer.parseInt(values[1]));
            key.setStartDate(java.sql.Date.valueOf(values[2]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.SalesterritoryhistoryPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getBusinessEntityID());
            sb.append(SEPARATOR);
            sb.append(value.getTerritoryID());
            sb.append(SEPARATOR);
            sb.append(value.getStartDate());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Salesterritoryhistory) {
            Salesterritoryhistory o = (Salesterritoryhistory) object;
            return getStringKey(o.getSalesterritoryhistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Salesterritoryhistory.class.getName()});
            return null;
        }
    }

}
