package SpringBootFifteenthDay.SpringDataGPAPracticing.Repository;


import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends JpaRepository <UserDatabase, Long> {
    List<UserDatabase> findByPassword(Integer password);

    @Query("SELECT u FROM UserDatabase u WHERE u.Id> :Id")
    List<UserDatabase> findByUsernameGreaterThanId(@Param("Id") Long Id);
}

