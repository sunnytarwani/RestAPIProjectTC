package com.suunny.RestAPIProjectTC.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(CloudVendorExceptionNotFound.class)
    public ResponseEntity<Object> handleCloudNotFound(CloudVendorExceptionNotFound cloudVendorExceptionNotFound){
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorExceptionNotFound.getMessage(),
                cloudVendorExceptionNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException , HttpStatus.NOT_FOUND);
    }
}
