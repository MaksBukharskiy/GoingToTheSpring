package SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectService;

import SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AppService;
import SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AroundService;
import SpringCoreTwelvethDay.GoingDeeperIntoAOP.Resources.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppService appService = context.getBean(AppService.class);
        AroundService aroundService = context.getBean(AroundService.class);

        appService.startEngine("V12");
        System.out.println("");

        aroundService.aspectService();

    }
}
