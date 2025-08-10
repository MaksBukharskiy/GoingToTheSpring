package SpringCoreEleventhDay.AspectLearning.AppService;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public void sayGreeting(String name) {
        System.out.println("Hello " + name);
    }

}
