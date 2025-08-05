package SpringCoreEighthDay.Repeat.Resources;

import SpringCoreEighthDay.Repeat.CarConfig;
import SpringCoreEighthDay.Repeat.Services.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        CarService carService = context.getBean(CarService.class);
        carService.carName();

        context.close();

    }
}
