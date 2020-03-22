package com.net.asterisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication(scanBasePackages = {
        "com.net.asterisk",
        "com.net.dialog",
        "com.net.data"
})
//@PropertySource("classpath:application.yml")
public class AsteriskServer {
    public static void main(String[] args) {
        SpringApplication.run(AsteriskServer.class,args);

        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
