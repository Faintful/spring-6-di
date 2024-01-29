package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // Since there is only one constructor in this class, and the class has been autowired where it is used in ConstructorInjectedControllerTest,
    // this constructor does not need an @Autowired at the class level, as Spring realizes that there is only one way for this class to be instantiated,
    // and that is via this constructor. This will work. However, @Autowired can still be applied at this level for consistency.

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
