package com.suunny.RestAPIProjectTC.Exception;

public class ClassVendorExceptionNotFound extends RuntimeException{
    public ClassVendorExceptionNotFound(String message) {
        super(message);
    }

    public ClassVendorExceptionNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
