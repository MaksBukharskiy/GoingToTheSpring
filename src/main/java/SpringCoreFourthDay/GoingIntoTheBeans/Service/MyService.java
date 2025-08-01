package SpringCoreFourthDay.GoingIntoTheBeans.Service;

import SpringCoreFourthDay.GoingIntoTheBeans.Repository.Info;
import SpringCoreFourthDay.GoingIntoTheBeans.Repository.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final Info info;
    private final Price price;

    @Autowired
    public MyService(Info info, Price price) {
        this.info = info;
        this.price = price;
    }

    public void printInfo() {
        System.out.println(info.toString());
    }

    public void printPrice(){
        System.out.println(price.toString());
    }
}
