package guru.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("env")
@Profile("uat")
public class EnvironmentServiceUAT implements EnvironmentService {
    @Override
    public String getEnv() {
        return "In UAT environment";
    }
}
