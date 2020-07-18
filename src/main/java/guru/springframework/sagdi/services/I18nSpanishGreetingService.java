package guru.springframework.sagdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by maikbartels on 2020.07.17
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Spanish";
    }
}
