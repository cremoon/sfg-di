package guru.springframework.sagdi.controllers;

import guru.springframework.sagdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by maikbartels on 2020.07.16
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
