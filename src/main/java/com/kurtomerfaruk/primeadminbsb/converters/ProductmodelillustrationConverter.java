package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelillustration;
import com.kurtomerfaruk.primeadminbsb.services.ProductmodelillustrationFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "productmodelillustrationConverter")
public class ProductmodelillustrationConverter implements Converter {

    @Inject
    private ProductmodelillustrationFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK();
        key.setProductModelID(Integer.parseInt(values[0]));
        key.setIllustrationID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.ProductmodelillustrationPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getProductModelID());
        sb.append(SEPARATOR);
        sb.append(value.getIllustrationID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Productmodelillustration) {
            Productmodelillustration o = (Productmodelillustration) object;
            return getStringKey(o.getProductmodelillustrationPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productmodelillustration.class.getName()});
            return null;
        }
    }

}
