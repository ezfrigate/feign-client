package org.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.sb")
@EnableFeignClients
public class FeignApp {
    public static void main(String[] args) {

        SpringApplication.run(FeignApp.class, args);
    }
}
