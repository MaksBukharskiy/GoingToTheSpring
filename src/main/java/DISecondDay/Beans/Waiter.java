package DISecondDay.Beans;

import org.springframework.stereotype.Component;


@Component
public class Waiter {

    private final Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void takeOrder(String order){
        System.out.println("Waiter took order: " + order);
        kitchen.cook(order);
    }
}
