package io.zipcoder.crudapp;

import io.zipcoder.crudapp.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by vidyachandasekhar on 6/18/17.
 * GET Retrieve the resource from the server.
   POST Create a resource on the server.
   PUT Update the resource on the server.
   DELETE Delete the resource from the server.
 */

@RepositoryRestResource
public interface PersonRestJPArepository extends CrudRepository<Person,Integer> {
}
