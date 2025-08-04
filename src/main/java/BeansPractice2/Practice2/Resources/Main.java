package BeansPractice2.Practice2.Resources;

import BeansPractice2.Practice2.AppConfig;
import BeansPractice2.Practice2.Service.AppService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppService result = context.getBean(AppService.class);
        result.lunch();

        context.close();

    }
}
