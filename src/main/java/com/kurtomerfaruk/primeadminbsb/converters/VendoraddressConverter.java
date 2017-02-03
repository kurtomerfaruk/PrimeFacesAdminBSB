package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Vendoraddress;
import com.kurtomerfaruk.primeadminbsb.services.VendoraddressFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "vendoraddressConverter")
public class VendoraddressConverter implements Converter {

    @Inject
    private VendoraddressFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.VendoraddressPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.VendoraddressPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.VendoraddressPK();
        key.setVendorID(Integer.parseInt(values[0]));
        key.setAddressID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.VendoraddressPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getVendorID());
        sb.append(SEPARATOR);
        sb.append(value.getAddressID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Vendoraddress) {
            Vendoraddress o = (Vendoraddress) object;
            return getStringKey(o.getVendoraddressPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Vendoraddress.class.getName()});
            return null;
        }
    }

}
