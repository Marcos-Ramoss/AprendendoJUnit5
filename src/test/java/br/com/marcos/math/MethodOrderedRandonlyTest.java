package br.com.marcos.math;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// intuito desse teste é garantir que os testes não sigam uma ordem.
// evitar que quando outro desenvolvedor adcionar outro teste não dependa dos demais seguindo a ordem!
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running Test A");
    }
    @Test
    void testB(){
        System.out.println("Running Test B");
    }
    @Test
    void testC(){
        System.out.println("Running Test C");
    }
    @Test
    void testD(){
        System.out.println("Running Test D");
    }


}
