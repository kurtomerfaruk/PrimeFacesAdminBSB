package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Purchaseorderdetail;
import com.kurtomerfaruk.primeadminbsb.services.PurchaseorderdetailFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "purchaseorderdetailConverter")
public class PurchaseorderdetailConverter implements Converter {

    @Inject
    private PurchaseorderdetailFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK();
        key.setPurchaseOrderID(Integer.parseInt(values[0]));
        key.setPurchaseOrderDetailID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.PurchaseorderdetailPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getPurchaseOrderID());
        sb.append(SEPARATOR);
        sb.append(value.getPurchaseOrderDetailID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Purchaseorderdetail) {
            Purchaseorderdetail o = (Purchaseorderdetail) object;
            return getStringKey(o.getPurchaseorderdetailPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Purchaseorderdetail.class.getName()});
            return null;
        }
    }

}
