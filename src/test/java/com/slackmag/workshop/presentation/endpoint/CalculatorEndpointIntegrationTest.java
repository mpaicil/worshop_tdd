package com.slackmag.workshop.presentation.endpoint;

import com.slackmag.workshop.WorkshopApplication;
import com.slackmag.workshop.presentation.requests.CalculatorRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.net.URI;
import java.net.URISyntaxException;

import static com.slackmag.workshop.common.CalculatorRequestFixture.defaultRequest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = WorkshopApplication.class)
class CalculatorEndpointIntegrationTest {

    @Autowired
    protected TestRestTemplate restTemplate;

    @Test
    void callToPlusEndpoint() throws URISyntaxException {
        CalculatorRequest calculatorRequest = defaultRequest().build();

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(new URI("http://localhost:8080/plus"), calculatorRequest, String.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo("444");
    }
}