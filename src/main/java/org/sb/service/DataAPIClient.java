package org.sb.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.sb.model.BloodGroup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@CircuitBreaker(name="SBCB", fallbackMethod = "defaultFallbackMethod")
@FeignClient(name = "SBClient", url = "https://random-data-api.com/") // Replace with your API URL
public interface DataAPIClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/v2/blood_types", produces = "application/json")
    BloodGroup getBloodGroup();

    default BloodGroup defaultFallbackMethod(Throwable t){
        System.out.println("X");
        return new BloodGroup();
    }

}
