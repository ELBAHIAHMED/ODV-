package com.example.microservices.limits_service.controller;

import com.example.microservices.limits_service.bean.Limits;
import com.example.microservices.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limits")
    public Limits retrieveLimist(){
        return new Limits(configuration.getMin(),configuration.getMax());
    }
}
