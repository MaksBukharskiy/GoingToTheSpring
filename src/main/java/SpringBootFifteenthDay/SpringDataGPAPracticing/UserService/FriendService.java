package SpringBootFifteenthDay.SpringDataGPAPracticing.UserService;

import SpringBootFifteenthDay.SpringDataGPAPracticing.Repository.UserDatabase;
import SpringBootFifteenthDay.SpringDataGPAPracticing.Repository.UsersRepository;
import SpringCoreFourteenthDay.SpringDataJPA.DataRepository.Friend;
import SpringCoreFourteenthDay.SpringDataJPA.DataRepository.FriendRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FriendService {

    private final UsersRepository usersRepository;

    public FriendService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Transactional
    public UserDatabase createUser(String username, Integer password) {
        if(username == null || username.isEmpty() || password == null) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }

        UserDatabase user = new UserDatabase(username.trim(), password);

        return usersRepository.save(user);
    }

    @Transactional(readOnly = true)
    public Optional<UserDatabase> findById(Long id){
        return usersRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<UserDatabase> findAll(){
        final List<UserDatabase> users = usersRepository.findAll();
        return users;
    }

    @Transactional(readOnly = true)
    public Optional<UserDatabase> findByPassword(Integer password){
        final List<UserDatabase> usersFoundByPassword =  usersRepository.findByPassword(password);
        return usersFoundByPassword.stream()
                .findFirst();
    }

}
