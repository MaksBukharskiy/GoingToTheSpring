package SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices;

import org.springframework.stereotype.Service;


@Service
public class AppService {

    public String startEngine(String engineName){
        System.out.println("Starting Engine" + engineName);
        return engineName;
    }

}
