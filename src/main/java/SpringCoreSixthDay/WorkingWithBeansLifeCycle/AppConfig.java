package SpringCoreSixthDay.WorkingWithBeansLifeCycle;

import SpringCoreSixthDay.WorkingWithBeansLifeCycle.Repository.DataBase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("SpringCoreSixthDay.WorkingWithBeansLifeCycle")
public class AppConfig {

    @Bean(initMethod = "connect", destroyMethod = "disconnect")
    public DataBase dataBase() {
        return new DataBase();
    }

}
