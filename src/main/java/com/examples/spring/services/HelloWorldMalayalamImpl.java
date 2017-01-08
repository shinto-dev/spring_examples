package com.examples.spring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by shintoz on 08/01/17.
 */
public class HelloWorldMalayalamImpl implements HelloWorldService {

    @Override
    public String getGreetings() {
        return "Malayalam Hello world :P";
    }
}
