package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderheadersalesreason;
import com.kurtomerfaruk.primeadminbsb.services.SalesorderheadersalesreasonFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "salesorderheadersalesreasonConverter")
public class SalesorderheadersalesreasonConverter implements Converter {

    @Inject
    private SalesorderheadersalesreasonFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK();
        key.setSalesOrderID(Integer.parseInt(values[0]));
        key.setSalesReasonID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.SalesorderheadersalesreasonPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getSalesOrderID());
        sb.append(SEPARATOR);
        sb.append(value.getSalesReasonID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Salesorderheadersalesreason) {
            Salesorderheadersalesreason o = (Salesorderheadersalesreason) object;
            return getStringKey(o.getSalesorderheadersalesreasonPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Salesorderheadersalesreason.class.getName()});
            return null;
        }
    }

}
