package SpringBootFifteenthDay.SpringDataGPAPracticing.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsersRepository extends JpaRepository <UserDatabase, Long> {
    List<UserDatabase> findByUsername(String username);
}

