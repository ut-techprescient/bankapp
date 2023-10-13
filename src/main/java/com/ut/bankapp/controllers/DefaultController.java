package com.ut.bankapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/hello")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("ok");
    }
}
