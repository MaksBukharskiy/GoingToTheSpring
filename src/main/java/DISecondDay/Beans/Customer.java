package DISecondDay.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {
    private Waiter waiter;

    @Autowired
    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void order(String order){
        System.out.println("Customer ordered:" + order);
        waiter.takeOrder(order);
    }
}
