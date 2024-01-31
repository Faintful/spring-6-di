package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings from field injection";
    }
}
