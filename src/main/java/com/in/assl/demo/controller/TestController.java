package com.in.assl.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        return new ResponseEntity<>("Hello  "+name, HttpStatus.OK);
    }
    @GetMapping("/goodbye/{name}")
    public ResponseEntity<String> sayGoodbye(@PathVariable String name) {
        return new ResponseEntity<>("Goodbye  "+name, HttpStatus.OK);
    }
}
