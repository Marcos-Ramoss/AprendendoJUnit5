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
                "Manaus - BR",
                "Masculino",
                "mar.stark.99@gmail.com"
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
        System.out.println(person.getId());

        assertEquals(
                person.getFirstName(),
                actual.getFirstName(),
                () -> "The FistName is Diferent ");
        System.out.println(person.getFirstName());


        assertEquals(
                person.getLastName(),
                actual.getLastName(),
                () -> "The getLastName is Diferent ");
        System.out.println(person.getLastName());


        assertEquals(
                person.getAddress(),
                actual.getAddress(),
                () -> "The getAddress is Diferent ");
        System.out.println(person.getAddress());


        assertEquals(
                person.getGender(),
                actual.getGender(),
                () -> "The getLastName is Diferent ");
        System.out.println(person.getGender());

        assertEquals(
                person.getEmail(),
                actual.getEmail(),
                () -> "The getLastName is Diferent ");
        System.out.println(person.getEmail());



    }

    @DisplayName(" When Create a Person with null e-Mail shold throw Exception ")
    @Test
    void testCreatePerson_WhithNullEmail_SholdThrowIllegalArgument(){

        IPersonService service = new PersonService();
        person.setEmail(null);

        assertThrows(
                IllegalAccessException.class,
                () -> service.createPerson(person),
                () -> "Empty e-Mail shold have cause an IllegalAccessException! ");
    }


}
