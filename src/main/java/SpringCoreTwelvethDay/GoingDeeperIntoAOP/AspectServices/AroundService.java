package SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices;

import org.springframework.stereotype.Service;

@Service
public class AroundService {

    public void aspectService(){
        System.out.println("AroundService is running");
    }

}
