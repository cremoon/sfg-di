package guru.springframework.sagdi.controllers;

import guru.springframework.sagdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by maikbartels on 2020.07.16
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public  String getGreeting() {
        return greetingService.sayGreeting();
    }
}
