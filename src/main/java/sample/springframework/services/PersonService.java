package sample.springframework.services;

import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.springframework.models.Person;

public interface PersonService {
    public Flux<Person> getPersons();
    public Mono<Person> getPerson(@PathVariable Integer id);
}
