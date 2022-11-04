package com.example.trialProyect.invented;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/students")
public class inventedController {

    @GetMapping
    public String getInverted() {
        return "TODO INVENTADO";
    }



}


