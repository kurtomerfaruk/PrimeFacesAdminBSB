package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Productmodelproductdescriptionculture;
import com.kurtomerfaruk.primeadminbsb.services.ProductmodelproductdescriptioncultureFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@FacesConverter(value = "productmodelproductdescriptioncultureConverter")
public class ProductmodelproductdescriptioncultureConverter implements Converter {

    @Inject
    private ProductmodelproductdescriptioncultureFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK();
            key.setProductModelID(Integer.parseInt(values[0]));
            key.setProductDescriptionID(Integer.parseInt(values[1]));
            key.setCultureID(values[2]);
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.ProductmodelproductdescriptionculturePK value) {
        StringBuffer sb = new StringBuffer();
            sb.append(value.getProductModelID());
            sb.append(SEPARATOR);
            sb.append(value.getProductDescriptionID());
            sb.append(SEPARATOR);
            sb.append(value.getCultureID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null || 
            (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Productmodelproductdescriptionculture) {
            Productmodelproductdescriptionculture o = (Productmodelproductdescriptionculture) object;
            return getStringKey(o.getProductmodelproductdescriptionculturePK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productmodelproductdescriptionculture.class.getName()});
            return null;
        }
    }

}
