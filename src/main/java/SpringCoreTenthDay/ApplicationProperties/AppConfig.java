package SpringCoreTenthDay.ApplicationProperties;

import SpringCoreTenthDay.ApplicationProperties.MyAppDb.DataBase;
import SpringCoreTenthDay.ApplicationProperties.MyAppService.AppService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public AppService appService(DataBase dataBase) {
        return new AppService(dataBase);
    }

}
