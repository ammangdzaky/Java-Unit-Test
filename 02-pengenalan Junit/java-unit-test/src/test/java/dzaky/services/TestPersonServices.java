package dzaky.services;

import dzaky.data.Person;
import dzaky.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class TestPersonServices {

    @Mock
    PersonRepository personRepository;

    PersonServices personServices;

    @BeforeEach
    public void setUp() {
        personServices = new PersonServices(personRepository);
    }

    @Test
    public void testFailedSelect(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personServices.get("not found");
        });
    }


    @Test
    public void testSuccesSelect(){

        // menambah behivor ke mock object
        Mockito.when(personRepository.selectById("01")).thenReturn(new Person("01", "Dzaky"));
        // menambah behivor ke mock object
        Mockito.when(personRepository.selectById("02")).thenReturn(new Person("02", null));

        var person1 = personServices.get("01");
        var person2 = personServices.get("02");

        Assertions.assertNotNull(person1);
        Assertions.assertEquals("01", person1.getId());
        Assertions.assertEquals("Dzaky", person1.getName());

        Assertions.assertNotNull(person2);
        Assertions.assertEquals("02", person2.getId());
        Assertions.assertEquals(null, person2.getName());

        Assertions.assertNull(personRepository.selectById("not found"));
    }


    @Test
    public void testRegister(){
        var person = personServices.register("Dzaky");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Dzaky", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Dzaky"));
    }

}
