package com.example.HelloWorld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        logger.info("Received request for /api/hello/{}", name);

        if (name.length() < 3) {
            logger.warn("Name '{}' is too short!", name);
        }

        if ("error".equalsIgnoreCase(name)) {
            logger.error("Invalid name '{}' received!", name);
            return "Error: Invalid name provided!";
        }

        return "Hello " + name + " from BridgeLabz!";
    }
}
