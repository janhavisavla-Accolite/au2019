package com.accolite.spring.employeeexample;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Autowired
    public PersonService myservice;
    
    @Value("${name}")
    public String name;

    @RequestMapping("/getpersonInfo")
    public List<Person> personInformation() {
        List<Person> persons = myservice.getAllPerson();
        return persons;
    }
    
    @RequestMapping("/getname")
    public String personname() {
        return name;
    }
}