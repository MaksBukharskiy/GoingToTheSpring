package SpringCoreTwelvethDay.GoingDeeperIntoAOP.Resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "SpringCoreTwelvethDay.GoingDeeperIntoAOP")
public class AppConfig {
}
