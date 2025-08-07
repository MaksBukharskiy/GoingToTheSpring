package SpringCoreNinethDay.ProfileLearning;

import SpringCoreNinethDay.ProfileLearning.AppService.DevService;
import SpringCoreNinethDay.ProfileLearning.AppService.ProdService;
import SpringCoreNinethDay.ProfileLearning.Repository.DataBase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    public DataBase dataBase() {
        return new DataBase();
    }

    @Bean
    @Profile("dev")
    public DevService devService(DataBase db) {
        return new DevService(db);
    }

    @Bean
    @Profile("test")
    public ProdService prodService(DataBase db) {
        return new ProdService(db);
    }

}
