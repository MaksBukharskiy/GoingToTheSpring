package SpringBootSixteenthDay.PaginationLearning.Resources;

import SpringBootSixteenthDay.PaginationLearning.Repository.User;
import SpringBootSixteenthDay.PaginationLearning.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
@ComponentScan(basePackages = "SpringBootSixteenthDay.PaginationLearning")
@EntityScan(basePackages = "SpringBootSixteenthDay.PaginationLearning.Repository")
@EnableJpaRepositories(basePackages = "SpringBootSixteenthDay.PaginationLearning.Repository")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return args -> {

            User user1 = new User("freedom_lovver", 16);
            User user2 = new User("mike666", 46);
            User user3 = new User("frver", 23);
            User user4 = new User("miles", 54);
            User user5 = new User("nelly", 12);
            User user6 = new User("felian111", 54);

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
            userRepository.save(user4);
            userRepository.save(user5);
            userRepository.save(user6);

            System.out.println("✅ 6 Users had created\n");

            int pageSize = 3;

            for (int page = 0; ; page++) {

                Pageable pageable = PageRequest.of(page, pageSize);
                Page<User> userPage = userRepository.findAll(pageable);

                System.out.println("--- Страница " + page + " ---");

                userPage.getContent().forEach(System.out::println);

                if (userPage.hasNext()) {
                    System.out.println("Есть следующая страница...\n");
                } else {
                    System.out.println("\n🔚 Больше нет страниц.");
                    break;
                }
            }
        };
    }
}
