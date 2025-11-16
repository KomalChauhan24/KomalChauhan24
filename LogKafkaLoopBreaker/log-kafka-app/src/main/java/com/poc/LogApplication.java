package com.poc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController

public class LogApplication {
   private static final Logger log = LoggerFactory.getLogger(LogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "world") String name) {
        log.info("Saying hello to {}", name);
        System.out.println("Saying hello to " + name);

        if ("error".equals(name)) {
            log.error("Error name used!");
        }
        return "Hello, " + name;
    }
}
