package br.com.marcos.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoRepeatedTest {

    SimpleMath simpleMath;

    @BeforeEach
    void BeforeEachMethod() {
        simpleMath = new SimpleMath();
        System.out.println("Runnig @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition" + "{currentRepetition} of {totalRepetitions}" + " ! ")
    void testDivision(RepetitionInfo repetitionInfo) {

        System.out.println(" Repetition N°" + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());

        double firstNumber = 10D;
        double secondNumber = 5D;

        Double actual = simpleMath.division(firstNumber, secondNumber);
        double expected = 2D;
        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce: " + expected + " ! ");
    }
}
