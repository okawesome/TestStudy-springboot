package com.teststudy.springbootstudy.controller;

import com.teststudy.springbootstudy.service.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/")
public class ApiController {

    @Autowired
    Greet gtemp;

    @RequestMapping(name = "greeting api", path = "/greet", method = GET)
    public Greet greet() {
//        return new Greet(1, "minseok jang");
        return gtemp;
    }

}
