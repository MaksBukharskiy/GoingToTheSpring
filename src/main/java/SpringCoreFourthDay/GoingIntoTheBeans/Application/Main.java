package SpringCoreFourthDay.GoingIntoTheBeans.Application;

import SpringCoreFourthDay.GoingIntoTheBeans.InfoConfiguration;
import SpringCoreFourthDay.GoingIntoTheBeans.Service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InfoConfiguration.class)) {

            MyService service = context.getBean(MyService.class);
            service.printInfo();

        }
    }
}

