package br.com.marcos.personService;


import br.com.marcos.model.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {
    @Override
    public Person createPerson(Person person) {
        // simula acesso a uma base de dados do ID
        var id = new AtomicLong().incrementAndGet();
        person.setId(id);

        return person;
    }
}
