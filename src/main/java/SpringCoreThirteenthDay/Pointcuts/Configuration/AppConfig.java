package SpringCoreThirteenthDay.Pointcuts.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {
        "SpringCoreThirteenthDay.Pointcuts.Services",
        "SpringCoreThirteenthDay.Pointcuts.AppAspect"
})

public class AppConfig {
}
