package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productproductphoto;
import com.blogspot.ofarukkurt.primeadminbsb.services.ProductproductphotoFacade;
import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "productproductphotoConverter")
public class ProductproductphotoConverter implements Converter {

    @Inject
    private ProductproductphotoFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK getKey(String value) {
        com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK();
        key.setProductID(Integer.parseInt(values[0]));
        key.setProductPhotoID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.blogspot.ofarukkurt.primeadminbsb.models.ProductproductphotoPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getProductID());
        sb.append(SEPARATOR);
        sb.append(value.getProductPhotoID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Productproductphoto) {
            Productproductphoto o = (Productproductphoto) object;
            return getStringKey(o.getProductproductphotoPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productproductphoto.class.getName()});
            return null;
        }
    }

}
