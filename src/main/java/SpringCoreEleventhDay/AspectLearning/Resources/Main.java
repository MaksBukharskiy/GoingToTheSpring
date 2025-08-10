package SpringCoreEleventhDay.AspectLearning.Resources;

import SpringCoreEleventhDay.AspectLearning.AppConfig;
import SpringCoreEleventhDay.AspectLearning.AppService.AppService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService appService = context.getBean(AppService.class);

        appService.sayGreeting("MaksBukharskiy");
        context.close();
    }
}
