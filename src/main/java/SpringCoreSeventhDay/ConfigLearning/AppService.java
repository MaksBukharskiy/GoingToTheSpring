package SpringCoreSeventhDay.ConfigLearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AppService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;


    @PostConstruct
    public void init() {
        System.out.println("name: " + appName + " version: " + appVersion);
    }


}
