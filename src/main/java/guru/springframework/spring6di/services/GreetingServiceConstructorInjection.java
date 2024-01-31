package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
public class GreetingServiceConstructorInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings from constructor injection";
    }
}
