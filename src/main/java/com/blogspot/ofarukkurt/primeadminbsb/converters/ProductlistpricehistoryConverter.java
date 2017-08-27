package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productlistpricehistory;
import com.blogspot.ofarukkurt.primeadminbsb.services.ProductlistpricehistoryFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "productlistpricehistoryConverter")
public class ProductlistpricehistoryConverter implements Converter {

    @Inject
    private ProductlistpricehistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.ProductlistpricehistoryPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.ProductlistpricehistoryPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.blogspot.ofarukkurt.primeadminbsb.models.ProductlistpricehistoryPK();
            key.setProductID(Integer.parseInt(values[0]));
            key.setStartDate(java.sql.Date.valueOf(values[1]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.ProductlistpricehistoryPK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getProductID());
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
        if (object instanceof Productlistpricehistory) {
            Productlistpricehistory o = (Productlistpricehistory) object;
            return getStringKey(o.getProductlistpricehistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productlistpricehistory.class.getName()});
            return null;
        }
    }

}
