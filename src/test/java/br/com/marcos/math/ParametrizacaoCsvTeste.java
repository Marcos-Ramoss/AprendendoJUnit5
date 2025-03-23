package br.com.marcos.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizacaoCsvTeste {

    SimpleMath simpleMath;

    @BeforeAll
    static void setup() {
        System.out.println("Runnig @BeforeAll method!");
    }

    @AfterAll
    static void clenup() {
        System.out.println("Runnig @ @AfterAll method!");
    }

    @BeforeEach
    void BeforeEachMethod() {
        simpleMath = new SimpleMath();
        System.out.println("Runnig @BeforeEach method!");
    }

    @AfterEach
    void afterEachMethod() {
        simpleMath = new SimpleMath();
        System.out.println("Runnig @AfterEach method!");
    }

    @DisplayName("Operation to division")
    @ParameterizedTest
    @CsvSource({
            "6D, 2D, 3D",
            "10D, 2D, 5D",
            "20D, 2D, 10D"
    })
    void testDivision(Double firstNumber, Double secondNumber, double expected) {
        Double actual = simpleMath.division(firstNumber, secondNumber);
        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce: " + expected + " ! ");
    }


}
