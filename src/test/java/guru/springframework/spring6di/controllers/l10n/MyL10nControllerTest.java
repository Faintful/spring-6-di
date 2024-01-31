package guru.springframework.spring6di.controllers.l10n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class MyL10nControllerTest {

    @Autowired
    MyL10nController myL10nController;

    @Test
    void sayHello() {
        System.out.println(myL10nController.sayHello());
    }

}