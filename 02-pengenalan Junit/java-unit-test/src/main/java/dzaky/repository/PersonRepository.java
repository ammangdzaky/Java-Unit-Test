package dzaky.repository;

import dzaky.data.Person;

public interface PersonRepository {

    Person selectById(String id);
    void insert(Person person);
}
