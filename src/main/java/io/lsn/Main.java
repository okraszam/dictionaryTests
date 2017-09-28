package io.lsn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
