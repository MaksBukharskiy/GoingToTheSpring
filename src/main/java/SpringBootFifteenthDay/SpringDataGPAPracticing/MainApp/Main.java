package SpringBootFifteenthDay.SpringDataGPAPracticing.MainApp;

import SpringBootFifteenthDay.SpringDataGPAPracticing.UserService.FriendService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
        TaskSchedulingAutoConfiguration.class
})
@EnableJpaRepositories(basePackages = "SpringBootFifteenthDay.SpringDataGPAPracticing.Repository")
@EntityScan(basePackages = "SpringBootFifteenthDay.SpringDataGPAPracticing.Repository")
@ComponentScan(basePackages = "SpringBootFifteenthDay.SpringDataGPAPracticing.UserService")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(FriendService friendService) {
        return args -> {
            friendService.createUser("Maks", 123);
            friendService.createUser("Mike", 321);
            friendService.createUser("Miles", 435241);
            friendService.createUser("Melany", 6785432);


            System.out.println("\nUser created ->");
            System.out.println("Lets find by id:");

            friendService.findById(4L).ifPresent(System.out::println);

            System.out.println("\nLets find first by password");
            friendService.findByPassword(321).ifPresent(System.out::println);

            System.out.println("\nLets find by ID:");
            friendService.findById(4L).ifPresent(System.out::println);

            System.out.println("\nLets show all users:");
            friendService.findAll().forEach(System.out::println);
            System.out.println("");

        };
    }
}
