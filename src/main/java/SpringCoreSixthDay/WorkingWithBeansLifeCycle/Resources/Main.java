package SpringCoreSixthDay.WorkingWithBeansLifeCycle.Resources;

import SpringCoreSixthDay.WorkingWithBeansLifeCycle.AppConfig;
import SpringCoreSixthDay.WorkingWithBeansLifeCycle.Service.AppService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppService service = context.getBean(AppService.class);
        service.processData();

        context.close();
    }
}
