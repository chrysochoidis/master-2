package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Controller {

	//localhost:8080/hello
	@GetMapping()
	public String hello() {
		return " Hello World! This is the default mapping";
	}

	//localhost:8080/hello/hello/{name}
	@GetMapping(path = "/hello/{name}")
	public String helloName(@PathVariable(value = "name") String name) {
		return "Hello " + name;
	}

	//localhost:8080/hello/helloandage/{name}?age={age}
	@GetMapping(path = "/helloandage/{name}")
	public String helloNameAndAge(@PathVariable(value = "name") String name, @RequestParam(value = "age") int age) {
		return "Hello " + name + " " + age;
	}

	//localhost:8080/hello/helloagelocation/{name}?age={age}&location={location}
	@GetMapping(path = "/helloagelocation/{name}")
	public String helloNameAndAge(@PathVariable(value = "name") String name, @RequestParam(value = "age") int age,
			@RequestParam(value = "location") String location) {
		Person p1 = new Person(name, age, location);
		return p1.getData();
	}

	@GetMapping(path = "/list")
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("My name is Tasos");
		list.add("My age is 31");
		return list;
	}
}