package guru.springframework.spring6di.services.l10n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"}) // "default" is reserved as a name for profiles. Its use is when there is no other active profile.
@Service("l10nService")
public class EnglishGreetingService implements GreetingService {
    public EnglishGreetingService() {
        System.out.println("testing");
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }

}
