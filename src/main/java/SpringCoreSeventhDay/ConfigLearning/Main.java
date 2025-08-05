package SpringCoreSeventhDay.ConfigLearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppService appService = context.getBean(AppService.class);
        appService.init();

    }
}
