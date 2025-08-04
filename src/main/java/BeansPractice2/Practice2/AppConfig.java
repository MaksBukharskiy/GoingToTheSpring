package BeansPractice2.Practice2;

import BeansPractice2.Practice2.Service.AppService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("BeansPractice2.Practice2")
@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AppService appService() {
        System.out.println("hello");
        return new AppService();
    }

}
