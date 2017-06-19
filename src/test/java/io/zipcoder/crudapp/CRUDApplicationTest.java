package io.zipcoder.crudapp;

import io.zipcoder.crudapp.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vidyachandasekhar on 6/18/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CRUDApplicationTest {
    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void testPostAndThenGet() {
        Person person = new Person();
        HttpEntity<Person> request = new HttpEntity<>(person);

        ResponseEntity<Person> response = this.restTemplate
                .exchange("/persons", HttpMethod.POST, request, Person.class);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.CREATED);

    }


}
