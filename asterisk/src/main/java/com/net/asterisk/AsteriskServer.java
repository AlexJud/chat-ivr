package com.net.asterisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.net.asterisk",
        "com.net.dialog"
})
public class AsteriskServer {
    public static void main(String[] args) {
        SpringApplication.run(AsteriskServer.class,args);
    }
}
