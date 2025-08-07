package SpringCoreNinethDay.ProfileLearning.Resoursces;

import SpringCoreNinethDay.ProfileLearning.AppConfig;
import SpringCoreNinethDay.ProfileLearning.AppService.DevService;
import SpringCoreNinethDay.ProfileLearning.AppService.ProdService;
import SpringCoreNinethDay.ProfileLearning.Repository.Weather;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("test");
        context.register(AppConfig.class);
        context.refresh();

        ProdService prodService = context.getBean(ProdService.class);
        System.out.println(prodService.getWeather());

        context.close();
    }
}
