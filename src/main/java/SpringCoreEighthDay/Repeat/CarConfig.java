package SpringCoreEighthDay.Repeat;

import SpringCoreEighthDay.Repeat.Services.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ComponentScan("SpringCoreEighthDay.Repeat")
@PropertySource("classpath:application.properties")
@Configuration
public class CarConfig {

}
