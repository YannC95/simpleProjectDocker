package fr.isika.al25.javaGroup.simpleProjectDocker.controller;

import fr.isika.al25.javaGroup.simpleProjectDocker.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String accueil(Model model) {

        model.addAttribute("name", "");
        model.addAttribute("message", "");

        return "index";
    }

    @PostMapping(value = "/hello")
    public String hello(
            @RequestParam("name") String name,
            Model model) {

        String message = "Hello " + name;

        model.addAttribute("name", "");
        model.addAttribute("message", message);


        return "index";
    }

}
