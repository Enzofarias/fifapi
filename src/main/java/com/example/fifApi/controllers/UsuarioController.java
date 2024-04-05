package com.example.fifApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class UsuarioController {
    
    @GetMapping("/test")
    public ResponseEntity<String> testResponse(){
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
