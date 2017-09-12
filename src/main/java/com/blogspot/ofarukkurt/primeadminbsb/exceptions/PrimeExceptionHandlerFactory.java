package com.blogspot.ofarukkurt.primeadminbsb.exceptions;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * @author Omer Faruk KURT
 * @Created on date 12/09/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
public class PrimeExceptionHandlerFactory extends ExceptionHandlerFactory {

    private final ExceptionHandlerFactory wrapped;

    public PrimeExceptionHandlerFactory(final ExceptionHandlerFactory wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ExceptionHandler getExceptionHandler() {
        return new PrimeExceptionHandler(wrapped.getExceptionHandler());
    }

    @Override
    public ExceptionHandlerFactory getWrapped() {
        return wrapped;
    }
}
