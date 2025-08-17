package SpringCoreFourteenthDay.SpringDataJPA.MainApp;

import SpringCoreFourteenthDay.SpringDataJPA.DataRepository.Friend;
import SpringCoreFourteenthDay.SpringDataJPA.DataRepository.FriendRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {TaskSchedulingAutoConfiguration.class})
@ComponentScan(basePackages = "SpringCoreFourteenthDay.SpringDataJPA")
@EntityScan(basePackages = "SpringCoreFourteenthDay.SpringDataJPA.DataRepository")
@EnableJpaRepositories(basePackages = "SpringCoreFourteenthDay.SpringDataJPA.DataRepository")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(FriendRepository friendRepository) {
        return args -> {
            friendRepository.save(new Friend("John"));
            friendRepository.save(new Friend("Jane"));

            System.out.println("All friends:");
            friendRepository.findAll().forEach(System.out::println);
        };
    }
}