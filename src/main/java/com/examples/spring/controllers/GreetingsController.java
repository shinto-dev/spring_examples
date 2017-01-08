package com.examples.spring.controllers;

import com.examples.spring.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by shintoz on 08/01/17.
 */
public class GreetingsController {
    private HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    public void sayHello() {
         System.out.println( helloWorldService.getGreetings());
    }
}
