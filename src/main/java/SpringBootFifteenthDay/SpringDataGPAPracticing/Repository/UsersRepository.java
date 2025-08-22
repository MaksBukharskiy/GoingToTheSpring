package SpringBootFifteenthDay.SpringDataGPAPracticing.Repository;


import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsersRepository extends JpaRepository <UserDatabase, Long> {
    List<UserDatabase> findByPassword(Integer password);
}

