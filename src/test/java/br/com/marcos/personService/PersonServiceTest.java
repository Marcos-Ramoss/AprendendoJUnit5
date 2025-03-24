package br.com.marcos.personService;

import br.com.marcos.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    Person person;

    @BeforeEach
    void setup() {
        person = new Person(
                "Marcos",
                "Oliveira",
                "mar.stark.99@gmail.com",
                "Manaus - BR",
                "Masculino"
        );
    }

    @DisplayName(" When Create a Person with Sucess Shold Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertNotNull(actual, () -> "The createPerson() should not have returned null!! ");

    }


    @DisplayName(" When successfully creating a person, all data in the returned person object should be returned separately.")
    @Test
    void testCreatePerson_WhenSucessfully_CreatingPersonAlldataReturnedPersonObject_SholdReturnedSeparately() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertNotNull(person.getId(), ()-> "ID not null! ");

        assertEquals(
                person.getFirstName(),
                actual.getFirstName(),
                () -> "The FistName is Diferent ");

        assertEquals(
                person.getLastName(),
                actual.getLastName(),
                () -> "The getLastName is Diferent ");

        assertEquals(
                person.getAddress(),
                actual.getAddress(),
                () -> "The getAddress is Diferent ");

        assertEquals(
                person.getGender(),
                actual.getGender(),
                () -> "The getLastName is Diferent ");

        assertEquals(
                person.getEmail(),
                actual.getEmail(),
                () -> "The getLastName is Diferent ");

    }

}
