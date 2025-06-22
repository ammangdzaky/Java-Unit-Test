package dzaky.services;

import dzaky.data.Person;
import dzaky.repository.PersonRepository;

import java.util.UUID;

public class PersonServices {

    private PersonRepository personRepository;

    public PersonServices(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        var person = personRepository.selectById(id);
        if(person != null){
            return person;
        } else{
            throw new IllegalArgumentException("Personnot found");
        }
    }

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insert(person);
        return person;
    }
}
