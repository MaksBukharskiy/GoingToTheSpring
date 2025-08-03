package BeansPractice.Practice.Resourses;

import BeansPractice.Practice.AppConfig;
import BeansPractice.Practice.Repository.CoffeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CoffeeService coffeeService = context.getBean(CoffeeService.class);
        coffeeService.init();

        context.close();

    }
}
