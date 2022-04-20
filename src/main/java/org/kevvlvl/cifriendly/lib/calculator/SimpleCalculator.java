package org.kevvlvl.cifriendly.lib.calculator;

import java.util.Random;

/**
 * Implementation of a Simple calculator
 */
public class SimpleCalculator implements ICalculator {

    private final Random random;

    /**
     * Inversion of Control: Give control to the caller instead of strongly coupling this implementation to the Random instance
     * @param random Randomizer
     */
    public SimpleCalculator(Random random) {
        this.random = random;
    }

    @Override
    public int add(int num1, int num2) {

        System.out.printf("add %d with %d", num1, num2);
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {

        System.out.printf("subtract %d with %d", num1, num2);
        return num1 - num2;
    }

    @Override
    public int getRandom() {

        int rand = random.nextInt();
        System.out.printf("return Randomized number %d", rand);

        return rand;
    }

    @Override
    public int getRandom(int lowerBound, int upperBound) {

        int rand = random.nextInt(lowerBound, upperBound);
        System.out.printf("return Randomized between %d and %d = %d", lowerBound, upperBound, rand);

        return rand;
    }
}
