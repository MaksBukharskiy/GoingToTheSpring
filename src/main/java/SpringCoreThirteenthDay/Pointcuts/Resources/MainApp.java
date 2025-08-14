package SpringCoreThirteenthDay.Pointcuts.Resources;

import SpringCoreThirteenthDay.Pointcuts.Configuration.AppConfig;
import SpringCoreThirteenthDay.Pointcuts.Services.AppService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService appService = context.getBean(AppService.class);

        appService.callFriend("Maks");
        appService.callGroup("11A");

        context.close();

    }
}
