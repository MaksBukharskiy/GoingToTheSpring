package SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectService;

import SpringCoreTwelvethDay.GoingDeeperIntoAOP.AppService;
import SpringCoreTwelvethDay.GoingDeeperIntoAOP.Resources.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService appService = context.getBean(AppService.class);

        appService.startEngine("V12");

    }
}
