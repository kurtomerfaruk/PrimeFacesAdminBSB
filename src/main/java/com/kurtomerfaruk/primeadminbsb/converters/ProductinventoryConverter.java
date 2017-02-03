package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Productinventory;
import com.kurtomerfaruk.primeadminbsb.services.ProductinventoryFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "productinventoryConverter")
public class ProductinventoryConverter implements Converter {

    @Inject
    private ProductinventoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK();
        key.setProductID(Integer.parseInt(values[0]));
        key.setLocationID(Short.parseShort(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.ProductinventoryPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getProductID());
        sb.append(SEPARATOR);
        sb.append(value.getLocationID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Productinventory) {
            Productinventory o = (Productinventory) object;
            return getStringKey(o.getProductinventoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productinventory.class.getName()});
            return null;
        }
    }

}
