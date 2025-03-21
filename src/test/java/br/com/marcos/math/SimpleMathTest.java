package br.com.marcos.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.sum(8D, 2D);
        double expected = 10D;
        assertEquals(expected, actual );
        System.out.println(expected);
    }

    @Test
    void testSubtraction(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.subtraction(8D, 2D);
        double expected = 6D;
        assertEquals(expected, actual );
        System.out.println(expected);
    }

    @Test
    void testMultiplication(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.multiplication(8D, 2D);
        double expected = 16D;
        assertEquals(expected, actual );
        System.out.println(expected);
    }

    @Test
    void testDivision(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.division(8D, 2D);
        double expected = 4D;
        assertEquals(expected, actual );
        System.out.println(expected);
    }

    @Test
    void testMean(){
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.mean(8D, 8D);
        double expected = 8D;

        assertEquals(expected, actual );

    }

}
