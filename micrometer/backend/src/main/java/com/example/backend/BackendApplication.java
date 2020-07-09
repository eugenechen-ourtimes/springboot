package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @RestController
    class Welcome {
        @RequestMapping("/")
        String index() {
            StringBuilder sb = new StringBuilder();
            sb.append("<h1>");
            sb.append("Hello World!");
            sb.append("</h1>");
            sb.append("\n");
            return sb.toString();
        }
    }
}
