package com.learning.firstapi.controller;

import com.learning.firstapi.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/getResponse", method = RequestMethod.GET)
    public ResponseEntity getResponse(){
        Response response = new Response();
        response.setCurrentResponse("Success");
        return ResponseEntity.ok().body(response);
    }
}
