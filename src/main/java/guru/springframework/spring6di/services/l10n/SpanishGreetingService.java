package guru.springframework.spring6di.services.l10n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("l10nService")
public class SpanishGreetingService implements GreetingService {
    public SpanishGreetingService() {
        System.out.println("testando");
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}
