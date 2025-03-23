package br.com.marcos.math;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class ParametrizacaoValueSourceTeste {

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

    @ParameterizedTest
    @ValueSource(strings = {"Marcos", "Aprendendo", "TesteUnitarios" })
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);

    }
}
