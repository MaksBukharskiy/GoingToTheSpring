package DISecondDay;

import DISecondDay.Beans.Customer;
import DISecondDay.Config.CafeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CafeApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CafeConfiguration.class);
        Customer customer = context.getBean("customer", Customer.class);

        customer.order("Pizza and salad");
    }
}
