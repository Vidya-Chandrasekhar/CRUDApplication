package io.zipcoder.crudapp;

import io.zipcoder.crudapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vidyachandasekhar on 6/15/17.
 */
public interface PersonRepository  extends JpaRepository<Person, Integer> {
}
