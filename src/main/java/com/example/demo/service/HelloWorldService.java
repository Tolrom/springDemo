package com.example.demo.service;

import com.example.demo.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }
}
