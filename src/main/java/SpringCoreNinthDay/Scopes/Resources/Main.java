package SpringCoreNinthDay.Scopes.Resources;

import SpringCoreNinthDay.Scopes.AppConfig;
import SpringCoreNinthDay.Scopes.Services.PrototypeService;
import SpringCoreNinthDay.Scopes.Services.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonService singletonService1 = context.getBean(SingletonService.class);
        SingletonService singletonService2 = context.getBean(SingletonService.class);

        PrototypeService prototypeService1 = context.getBean(PrototypeService.class);
        PrototypeService prototypeService2 = context.getBean(PrototypeService.class);

        singletonService1.increaseInstance();
        singletonService2.increaseInstance();

        prototypeService1.incrementCounter();
        prototypeService2.incrementCounter();

        System.out.println(singletonService1.getSingletonCounter());
        System.out.println(singletonService2.getSingletonCounter());

        System.out.println(prototypeService1.getCounter());
        System.out.println(prototypeService2.getCounter());


    }
}
