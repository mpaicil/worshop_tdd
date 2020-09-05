package com.slackmag.workshop.presentation.endpoint;

import com.slackmag.workshop.domain.Calculator;
import com.slackmag.workshop.presentation.requests.CalculatorRequest;
import com.slackmag.workshop.presentation.requests.CalculatorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorEndpoint {

    @PostMapping("/plus")
    public ResponseEntity<CalculatorResponse> plus(@RequestBody CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.result = Calculator.plus(request.valor1, request.valor2);
        return ResponseEntity.ok(response);
    }

}
