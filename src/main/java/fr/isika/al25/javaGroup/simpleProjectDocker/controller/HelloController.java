package fr.isika.al25.javaGroup.simpleProjectDocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.isika.al25.javaGroup.simpleProjectDocker.model.Hello;

@Controller
public class HelloController {

	private Hello hello = new Hello();
	
	@GetMapping("/")
	public String accueil() {
		return "index";
	}
	
	@PostMapping(value = "/hello")
	public void hello(@RequestBody String name) {
		hello.setName(name);
		System.out.println("Bonjour " + hello.getName() + " ... Vous êtes bien matinal ...");
	}
	
}
