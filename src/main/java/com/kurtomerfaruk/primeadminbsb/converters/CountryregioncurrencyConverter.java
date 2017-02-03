package com.kurtomerfaruk.primeadminbsb.converters;

import com.kurtomerfaruk.primeadminbsb.models.Countryregioncurrency;
import com.kurtomerfaruk.primeadminbsb.services.CountryregioncurrencyFacade;
import com.kurtomerfaruk.primeadminbsb.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "countryregioncurrencyConverter")
public class CountryregioncurrencyConverter implements Converter {

    @Inject
    private CountryregioncurrencyFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK getKey(String value) {
        com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK();
        key.setCountryRegionCode(values[0]);
        key.setCurrencyCode(values[1]);
        return key;
    }

    String getStringKey(com.kurtomerfaruk.primeadminbsb.models.CountryregioncurrencyPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getCountryRegionCode());
        sb.append(SEPARATOR);
        sb.append(value.getCurrencyCode());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Countryregioncurrency) {
            Countryregioncurrency o = (Countryregioncurrency) object;
            return getStringKey(o.getCountryregioncurrencyPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Countryregioncurrency.class.getName()});
            return null;
        }
    }

}
