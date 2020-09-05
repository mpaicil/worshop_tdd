package com.slackmag.workshop.common;

import com.slackmag.workshop.presentation.requests.CalculatorRequest;

public class CalculatorRequestFixture {

    private Integer firstValue;
    private Integer secondValue;

    private CalculatorRequestFixture() {
        firstValue = 123;
        secondValue = 321;
    }

    public static CalculatorRequestFixture defaultRequest() {
        return new CalculatorRequestFixture();
    }

    public CalculatorRequestFixture withFirstValue(Integer value) {
        firstValue = value;
        return this;
    }

    public CalculatorRequestFixture withSecondValue(Integer value) {
        secondValue = value;
        return this;
    }

    public CalculatorRequest build() {
        CalculatorRequest calculatorRequest = new CalculatorRequest();
        calculatorRequest.valor1 = firstValue;
        calculatorRequest.valor2 = secondValue;

        return calculatorRequest;
    }

}
