package org.kevvlvl.cifriendly.lib.calculator;

/**
 * Interface for the Calculator util
 */
public interface ICalculator {

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int getRandom();
    int getRandom(int lowerBound, int upperBound);
}
