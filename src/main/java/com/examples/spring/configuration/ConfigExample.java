package com.examples.spring.configuration;

import com.examples.spring.services.HelloWorldMalayalamImpl;
import com.examples.spring.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by shintoz on 08/01/17.
 *
 * Configuration is usually used for creating spring beans without using annotations. This is helpful
 * when we want initialize spring beans and if we dont have control over the classes, like some third party libraries.
 *
 */
@Configuration
public class ConfigExample {

    @Bean
    @Profile("malayalam")
    public HelloWorldService getMalayalamHelloWorldService() {
        return new HelloWorldMalayalamImpl();
    }
}
