package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by maikbartels on 2020.07.17
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PropertyInjectedGreetingService";
    }
}
