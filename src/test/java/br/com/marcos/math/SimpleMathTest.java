package br.com.marcos.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(" Test Math Operations in SimpleMath Class")
public class SimpleMathTest {

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
    @MethodSource("testDivisionInputParameters")
    void testDivision(Double firstNumber, Double secondNumber, double expected) {
        Double actual = simpleMath.division(firstNumber, secondNumber);
        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce: " + expected + " ! ");
    }

    public  static Stream<Arguments> testDivisionInputParameters(){
        return Stream.of(
                Arguments.of(6D, 2D, 3D),
                Arguments.of(10D, 2D, 5D),
                Arguments.of(20D, 2D, 10D)

        );
    }
}
