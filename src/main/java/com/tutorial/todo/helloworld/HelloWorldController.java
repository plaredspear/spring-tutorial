package com.tutorial.todo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by yslim on 4/6/16.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping(value = "/", method = GET)
    public String hello() {
        return "Hello World";
    }
}
