package io.zipcoder.crudapp;

import io.zipcoder.crudapp.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by vidyachandasekhar on 6/18/17.
 */

@RepositoryRestResource
public interface PersonRestJPArepository extends CrudRepository<Person,Integer> {
}
