package br.com.marcos.math;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Order(1)
public class PerformanceTest {

//obs: foi adcionado 10000000 para verificar a falha na perfomance

    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance(){
        int [] numbers = {1, 2, 10, 9, 32};
        for (int i=0; i < 10000000; i++ ){
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
