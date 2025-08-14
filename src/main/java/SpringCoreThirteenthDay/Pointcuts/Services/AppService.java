package SpringCoreThirteenthDay.Pointcuts.Services;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public void callFriend(String friendName) {
        System.out.println("Calling friend, " + friendName);
    }

    public void callGroup(String groupName) {
        System.out.println("Calling group, " + groupName);
    }

}
