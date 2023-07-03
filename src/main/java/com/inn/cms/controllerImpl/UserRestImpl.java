package com.inn.cms.controllerImpl;

import com.inn.cms.constants.CmsConstants;
import com.inn.cms.controller.UserRest;
import com.inn.cms.service.UserService;
import com.inn.cms.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
       try{
           return userService.signUp(requestMap);
       }catch (Exception ex) {
           ex.printStackTrace();
       }
        return CafeUtils.getResponseEntity(CmsConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
