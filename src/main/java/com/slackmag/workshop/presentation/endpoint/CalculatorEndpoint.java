package com.slackmag.workshop.presentation.endpoint;

import com.slackmag.workshop.presentation.requests.CalculatorRequest;
import org.springframework.http.ResponseEntity;

public class CalculatorEndpoint {

    public ResponseEntity<String> plus(CalculatorRequest request) {
        return ResponseEntity.ok("444");
    }
}
