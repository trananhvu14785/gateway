package com.example.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
    @PostMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Gateway service");
    }
}
