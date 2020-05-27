package sample.springframework.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.springframework.models.Person;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Override
    public Flux<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"Ryan","Thomas"));
        persons.add(new Person(2,"Shilpa","Shetty"));
        return Flux.fromIterable(persons);
    }

    @Override
    public Mono<Person> getPerson(Integer id) {
        Person p = null;
        if(id == 1){
            p = new Person(1,"Ryan","Thomas");
        }
        else{
            p = new Person(2,"Shilpa","Shetty");
        }
        return Mono.just(p);
    }
}
