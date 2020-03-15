package com.net.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication(scanBasePackages = {
        "com.net.rest",
        "com.net.data"
})
public class Rest {
    public static void main(String[] args) {
        SpringApplication.run(Rest.class,args);
    }
}
