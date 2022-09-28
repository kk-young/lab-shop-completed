package labshopcompleted.common;


import labshopcompleted.Order2Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { Order2Application.class })
public class CucumberSpingConfiguration {
    
}
