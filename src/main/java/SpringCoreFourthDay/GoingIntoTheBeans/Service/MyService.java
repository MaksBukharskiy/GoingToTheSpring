package SpringCoreFourthDay.GoingIntoTheBeans.Service;

import SpringCoreFourthDay.GoingIntoTheBeans.Repository.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final Info info;

    @Autowired
    public MyService(Info info) {
        this.info = info;
    }

    public void printInfo() {
        System.out.println(info.toString());
    }
}
