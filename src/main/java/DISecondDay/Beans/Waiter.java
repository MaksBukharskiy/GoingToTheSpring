package DISecondDay.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Waiter {

    private Kitchen kitchen;

    @Autowired
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void takeOrder(String order){
        System.out.println("Waiter took order: " + order);
        kitchen.cook(order);
    }
}
