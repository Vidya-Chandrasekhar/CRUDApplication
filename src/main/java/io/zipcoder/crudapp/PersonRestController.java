package io.zipcoder.crudapp;

import io.zipcoder.crudapp.entity.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vidyachandasekhar on 6/15/17.
 */
@RestController
@RequestMapping("/person")
public class PersonRestController {

    private final PersonRepository personRepository;

    PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(method = GET, value = "/{Id}")
    public Person getPerson(@PathVariable Integer Id) {
        return personRepository.getOne(Id);

    }


}
