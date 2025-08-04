package BeansPractice2.Practice2.Service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public void init(){
        System.out.println("breakfast");
    }

    public void lunch(){
        System.out.println("lunch");
    }

    public void destroy(){
        System.out.println("dinner");
    }

}
