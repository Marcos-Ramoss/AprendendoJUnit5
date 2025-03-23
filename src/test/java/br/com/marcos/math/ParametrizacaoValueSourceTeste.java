package br.com.marcos.math;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


public class ParametrizacaoValueSourceTeste {

    @ParameterizedTest
    @ValueSource(strings = {"Marcos", "Aprendendo", "TesteUnitarios" })
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);

    }
}
