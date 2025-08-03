package BeansPractice.Practice.Service;

import org.springframework.stereotype.Repository;

@Repository
public class CoffeeRepository {

    public void coffeeStart(){
        System.out.println("Starting doing Coffee");
    }

    public void coffeeEnd(){
        System.out.println("Ending doing Coffee");
    }

    public void coffeeBreak(){
        System.out.println("Coffee Break");
    }

}
