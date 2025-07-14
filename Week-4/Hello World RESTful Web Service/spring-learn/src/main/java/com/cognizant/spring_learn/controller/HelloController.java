package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/welcome")
    public String sayHello() {
        LOGGER.info("START");
        String response = "Hello world by Sandeep :)";
        LOGGER.info("END");
        return response;
    }
}
