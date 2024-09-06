package com.demo.shardingsphere.controller;

import com.demo.shardingsphere.core.Person;
import com.demo.shardingsphere.mapper.PersonMapper;
import com.demo.shardingsphere.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2024/4/19
 * Time: 15:05
 */
@RestController("/rest/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;;

    @PostMapping("/add")
    public void add() {
        Person person = new Person();
        person.setName("Test");
        person.setAge(20);
        person.setIdCard("1234567890987");
        person.setTelephone("12345678987");
        person.setUsername("tianwenyuan");
        personService.save(person);
    }

    @PostMapping("/get")
    public void get(@RequestBody Person dto) {
        Person person = personMapper.selectById(dto.getId());
        System.out.println(person);
    }
}
