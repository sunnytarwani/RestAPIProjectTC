package com.suunny.RestAPIProjectTC.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder(String message , HttpStatus httpStatus , Object responseObject){

        Map<String , Object> responseHashMap = new HashMap<>();
        responseHashMap.put("Message: " , message);
        responseHashMap.put("HttpStatus: " , httpStatus);
        responseHashMap.put("Data: " , responseObject);

        return new ResponseEntity<>(responseHashMap , httpStatus);
    }
}
