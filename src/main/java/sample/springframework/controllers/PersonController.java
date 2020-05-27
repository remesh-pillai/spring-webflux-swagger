package sample.springframework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.springframework.models.Person;
import sample.springframework.services.PersonService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public Flux<Person> getPersons(){
        return personService.getPersons();
    }
    @GetMapping("/persons/{id}")
    public Mono<Person> getPerson(@PathVariable Integer id){
        return personService.getPerson(id);
    }
}
