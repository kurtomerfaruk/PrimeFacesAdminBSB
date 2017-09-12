package com.blogspot.ofarukkurt.primeadminbsb.exceptions;

import java.io.Serializable;
import java.util.Date;


/**
 * @author Omer Faruk KURT
 * @Created on date 12/09/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
public class ExceptionInfo implements Serializable {

    public static final String ATTRIBUTE_NAME = ExceptionInfo.class.getName();
    private static final long serialVersionUID = 4416715688644628424L;

    private Throwable exception;
    private String type;
    private String message;
    private StackTraceElement[] stackTrace;
    private String formattedStackTrace;
    private Date timestamp;
    private String formattedTimestamp;
    private String firstRowException;

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StackTraceElement[] getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(StackTraceElement[] stackTrace) {
        this.stackTrace = stackTrace;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormattedStackTrace() {
        return formattedStackTrace;
    }

    public void setFormattedStackTrace(String formattedStackTrace) {
        this.formattedStackTrace = formattedStackTrace;
    }

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }

    public String getFirstRowException() {
        return firstRowException;
    }

    public void setFirstRowException(String firstRowException) {
        this.firstRowException = firstRowException;
    }
    
    
}
