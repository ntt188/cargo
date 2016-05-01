package com.springangular.example.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    public static final Logger logger = LogManager.getLogger(GreetingController.class);

    private static final String template = "Hello, %s!";

    @Autowired
    private Counter counter;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.info(name + " - " + counter.current());
        return new Greeting(counter.next(), String.format(template, name));
    }
}
