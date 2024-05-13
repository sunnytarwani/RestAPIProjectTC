package com.suunny.RestAPIProjectTC.Exception;

public class CloudVendorExceptionNotFound extends RuntimeException{
    public CloudVendorExceptionNotFound(String message) {
        super(message);
    }

    public CloudVendorExceptionNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
