package DISecondDay.Beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Kitchen {

    public void cook(String order){
        System.out.println("Kitchen start cooking: " + order);
    }
}
