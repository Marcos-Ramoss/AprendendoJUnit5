package br.com.marcos.personService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    @DisplayName(" When Create a Person with Sucess Shold Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject(){

        IPersonService service = new PersonService();

        Person person = new Person(
                "Marcos",
                "Oliveira",
                "mar.stark.99@gmail.com",
                "Manaus - BR",
                "Masculino"
        );

        Person actual = service.createPerson(person);

        assertNotNull(actual, () -> "The createPerson() should not have returned null!! ");

}

    @DisplayName(" When Create a Person with Sucess Shold Contains FirstName in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldConatainsFirstNameReturnedPersonObject(){

        IPersonService service = new PersonService();

        Person person = new Person(
                "Marcos",
                "Oliveira",
                "mar.stark.99@gmail.com",
                "Manaus - BR",
                "Masculino"
        );

        Person actual = service.createPerson(person);

        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FistName is Diferent ");

    }

}
