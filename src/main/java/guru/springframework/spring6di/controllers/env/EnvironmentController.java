package guru.springframework.spring6di.controllers.env;

import guru.springframework.spring6di.services.env.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    @Autowired
    public EnvironmentController(@Qualifier("env") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getData() {
        return environmentService.getEnv();
    }
}
