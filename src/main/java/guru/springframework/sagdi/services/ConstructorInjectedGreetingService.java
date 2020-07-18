package guru.springframework.sagdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by maikbartels on 2020.07.16
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - ConstructorInjectedGreetingService";
    }
}
