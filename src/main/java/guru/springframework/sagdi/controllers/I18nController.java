package guru.springframework.sagdi.controllers;

import guru.springframework.sagdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by maikbartels on 2020.07.17
 */
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
