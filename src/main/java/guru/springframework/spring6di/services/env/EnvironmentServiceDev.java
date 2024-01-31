package guru.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("env")
@Profile({"dev", "default"})
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "In dev environment";
    }
}
