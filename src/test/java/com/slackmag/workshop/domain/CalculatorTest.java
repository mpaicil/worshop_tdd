package com.slackmag.workshop.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void retrievePlusOfTwoValues() {
        Integer actualResult = calculator.plus(123, 321);

        assertThat(actualResult).isEqualTo(444);
    }

    @Test
    void retrieveMinus10() {
        Integer result = calculator.plus(-20, 10);

        assertThat(result).isEqualTo(-10)
                .isNegative();
    }
}