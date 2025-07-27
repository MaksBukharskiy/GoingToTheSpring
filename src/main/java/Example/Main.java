package Example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        CatComponent cat = context.getBean(CatComponent.class);
        DogComponent dog = context.getBean(DogComponent.class);

        System.out.println("Cats name is: " + cat.getname());
        System.out.println("Dogs name is: " + dog.getName());

    }
}
