package SpringCoreNinthDay.Scopes;


import SpringCoreNinthDay.Scopes.Services.PrototypeService;
import SpringCoreNinthDay.Scopes.Services.SingletonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration("SpringCoreNinthDay.Scopes")
public class AppConfig {

    @Bean
    @Scope("singleton")
    public SingletonService singletonService() {
        return new SingletonService();
    }

    @Bean
    @Scope("prototype")
    public PrototypeService prototypeService() {
        return new PrototypeService();
    }

}
