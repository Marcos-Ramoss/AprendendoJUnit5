package br.com.marcos.math;

import org.junit.jupiter.api.*;

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

    @DisplayName("Test 8 + 2 = 10")
    @Test
    void testSum() {
        double firstNumber = 8D;
        double secondNumber = 2D;

        assertThrows(ArithmeticException.class, ()-> {
            simpleMath.sum(firstNumber, secondNumber);
        });


    }

    @DisplayName("Test 8 - 2 = 6")
    @Test
    void testSubtraction() {
        double firstNumber = 8D;
        double secondNumber = 2D;
        Double actual = simpleMath.subtraction(firstNumber, secondNumber);
        double expected = 6D;
        assertEquals(expected, actual, () -> " O resultado não é valido: " + actual);
        System.out.println("est 8 - 2 = 6");
    }

    @DisplayName("Test 8 * 2 = 16 ")
    @Test
    void testMultiplication() {
        double firstNumber = 8D;
        double secondNumber = 2D;
        Double actual = simpleMath.multiplication(firstNumber, secondNumber);
        double expected = 16D;
        assertEquals(expected, actual, () -> " O resultado não é valido: " + actual);
        System.out.println("Test 8 * 2 = 16");

    }

    @DisplayName("Test 8 / 2 = 4 ")
    @Test
    void testDivision() {
        double firstNumber = 8D;
        double secondNumber = 2D;
        Double actual = simpleMath.division(firstNumber, secondNumber);
        double expected = 4D;
        assertEquals(expected, actual, () -> " O resuldado não é valido: " + actual);
        System.out.println("Test 8 / 2 = 4");
    }

    @DisplayName(" Test (8 + 8 )/ 2 = 8 ")
    @Test
    void testMean() {
        Double actual = simpleMath.mean(8D, 8D);
        double expected = 8D;
        assertEquals(expected, actual);
        System.out.println("Test (8 + 8 )/ 2 = 8");

    }

    @DisplayName(" Test Square Root of 49 = 7")
    @Test
    void testraizQuadrada() {
        Double valor = 49D;
        Double actual = simpleMath.raizQuadrada(valor);
        double expected = 7D;
        assertEquals(expected, actual, () -> " Não existe raiz: ");
        assertNotEquals(8D, actual);
        System.out.println("Test Square Root of 49 = 7");

    }

}
