package org.kevvlvl.cifriendly.lib.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

public class SimpleCalculatorTest {

    private final ICalculator simpleCalculator = new SimpleCalculator(new Random());

    @Test
    @DisplayName("Addition and expect correct result")
    void testAddition() {

        int num1 = 5;
        int num2 = 10;

        int result = simpleCalculator.add(num1, num2);

        assertThat(result).isEqualTo(num1 + num2);
    }

    @Test
    @DisplayName("Subtraction and expect correct result")
    void testSubtraction() {

        int num1 = 10;
        int num2 = 7;

        int result = simpleCalculator.subtract(num1, num2);

        assertThat(result).isEqualTo(num1 - num2);
    }

    @Test
    @DisplayName("Get Random Integer")
    void testGetRandomInteger() {

        int result = simpleCalculator.getRandom();

        assertThat(result).isBetween(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Test
    @DisplayName("Get Random Integer between two boundaries")
    void testGetRandomIntegerBetweenTwoBoundaries() {

        int lowerBound = 10;
        int upperBound = 100;

        int result = simpleCalculator.getRandom(lowerBound, upperBound);

        // lowerBound = inclusive. upperBound = exclusive
        assertThat(result).isBetween(lowerBound, upperBound - 1);
    }
}
