package SpringCoreThirdDay.FinalDIandIOCApp;

import SpringCoreThirdDay.FinalDIandIOCApp.Config.AppConfig;
import SpringCoreThirdDay.FinalDIandIOCApp.Services.ToDoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ToDoService app = context.getBean(ToDoService.class);

        app.addTask("Maks");

        app.findTask("Maks");

        System.out.println("All Done");
        System.out.println("Your TASKS: " );

        app.showAllTaks();

    }
}
