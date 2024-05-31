package org.sb.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.sb.model.BloodGroup;
import org.sb.service.DataAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RandomController {

    @Autowired
    private DataAPIClient dataAPIClient;

    @GetMapping("/bg")
    public BloodGroup bloodGroup() {
        return dataAPIClient.getBloodGroup();
    }
}

