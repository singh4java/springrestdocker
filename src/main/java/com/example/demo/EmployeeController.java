package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EmployeeController {

	@RequestMapping("/Person")
    public List<Person> greeting() {
		List<Person> personList = new ArrayList<Person>();
		for(int i = 0;i<100;i++){
		personList.add(new Person(i, "Person"+i));
		}
        return personList;
    }
}
