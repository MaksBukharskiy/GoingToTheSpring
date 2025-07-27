package Example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            Cat cat = context.getBean(Cat.class);
            System.out.println("Cats name is: " + cat.getname());

        }
    }
}
