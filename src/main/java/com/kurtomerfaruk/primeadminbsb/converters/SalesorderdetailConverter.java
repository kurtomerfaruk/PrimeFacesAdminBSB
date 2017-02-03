package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Salesorderdetail;
import com.kurtomerfaruk.primeadminbsb.services.SalesorderdetailFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "salesorderdetailConverter")
public class SalesorderdetailConverter implements Converter {

    @Inject
    private SalesorderdetailFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK();
        key.setSalesOrderID(Integer.parseInt(values[0]));
        key.setSalesOrderDetailID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.SalesorderdetailPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getSalesOrderID());
        sb.append(SEPARATOR);
        sb.append(value.getSalesOrderDetailID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Salesorderdetail) {
            Salesorderdetail o = (Salesorderdetail) object;
            return getStringKey(o.getSalesorderdetailPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Salesorderdetail.class.getName()});
            return null;
        }
    }

}
