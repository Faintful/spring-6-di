package guru.springframework.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("uat")
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getData() {
        System.out.println(environmentController.getData());
    }
}