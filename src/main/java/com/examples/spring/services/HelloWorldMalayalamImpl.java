package com.examples.spring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by shintoz on 08/01/17.
 */

/*
@Component
@Profile("malayalam")

We are not including the annotations here. This service is initialized using spring configurations.

*/
public class HelloWorldMalayalamImpl implements HelloWorldService {

    @Override
    public String getGreetings() {
        return "Malayalam Hello World!!";
    }
}
