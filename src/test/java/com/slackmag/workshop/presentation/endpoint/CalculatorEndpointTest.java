package com.slackmag.workshop.presentation.endpoint;

import com.slackmag.workshop.presentation.requests.CalculatorRequest;
import com.slackmag.workshop.presentation.requests.CalculatorResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CalculatorEndpointTest {

    private CalculatorEndpoint calculatorEndpoint;

    @BeforeEach
    void setUp() {
        calculatorEndpoint = new CalculatorEndpoint();
    }

    @Test
    void retrieve444HasResponse() {
        CalculatorRequest request = new CalculatorRequest();
        request.valor1 = 123;
        request.valor2 = 321;

        ResponseEntity<CalculatorResponse> responseEntity = calculatorEndpoint.plus(request);

        assertThat(responseEntity.getBody().result).isNotNull()
            .isEqualTo(444);
    }
}