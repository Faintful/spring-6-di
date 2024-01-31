package guru.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("env")
@Profile("prod")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "In prod environment";
    }
}
