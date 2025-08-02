package SpringCoreFifthDay;

import SpringCoreFifthDay.Config.Config;
import SpringCoreFifthDay.Service.AppService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AppService appService = context.getBean(AppService.class);

        var result1 = appService.printName1();
        var result2 = appService.printName2();

        System.out.println(result1);
        System.out.println(result2);

        context.close();

    }
}

