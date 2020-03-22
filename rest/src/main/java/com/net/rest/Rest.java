package com.net.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;

@SpringBootApplication(scanBasePackages = {
        "com.net.rest",
        "com.net.data"
})
//@PropertySource("classpath:application-data.yml")
public class Rest {
    public static void main(String[] args) {
        SpringApplication.run(Rest.class,args);
    }
}
