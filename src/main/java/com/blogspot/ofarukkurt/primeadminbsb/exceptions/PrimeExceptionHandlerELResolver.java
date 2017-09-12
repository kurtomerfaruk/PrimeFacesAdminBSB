package com.blogspot.ofarukkurt.primeadminbsb.exceptions;

import java.beans.FeatureDescriptor;
import java.util.Iterator;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.context.FacesContext;

/**
 * @author Omer Faruk KURT
 * @Created on date 12/09/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
public class PrimeExceptionHandlerELResolver extends ELResolver {

    public static final String EL_NAME = "pfExceptionHandler";

    @Override
    public Object getValue(ELContext elContext, Object base, Object property) {

        if (EL_NAME.equals(property)) {
            elContext.setPropertyResolved(true);

            FacesContext context = FacesContext.getCurrentInstance();
            ExceptionInfo info = (ExceptionInfo) context.getAttributes().get(ExceptionInfo.ATTRIBUTE_NAME);

            if (info == null) {
                info = (ExceptionInfo) context.getExternalContext().getSessionMap().get(ExceptionInfo.ATTRIBUTE_NAME);
            }

            return info;
        }

        return null;
    }

    @Override
    public Class<?> getType(ELContext context, Object base, Object property) {
        return null;
    }

    @Override
    public void setValue(ELContext context, Object base, Object property, Object value) {

    }

    @Override
    public boolean isReadOnly(ELContext context, Object base, Object property) {
        return true;
    }

    @Override
    public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext context, Object base) {
        return null;
    }

    @Override
    public Class<?> getCommonPropertyType(ELContext context, Object base) {
        return null;
    }
}
