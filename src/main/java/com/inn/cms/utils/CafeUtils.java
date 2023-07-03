package com.inn.cms.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {

    public CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String respnseMsg, HttpStatus httpStatus){
        return new ResponseEntity<>("respnseMsg",httpStatus);
    }
}
