package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Autowired
    private SomeRepository repository;

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

    @RestController
    class AccessDb {
        @RequestMapping("/db")
        String index() {
            StringBuilder sb = new StringBuilder();
            sb.append("<h1> Data: </h1>");
            repository.findAll().forEach(row -> sb.append("<h2>").append(row.toString()).append("</h2>"));
            sb.append('\n');
            return sb.toString();
        }
    }
}
