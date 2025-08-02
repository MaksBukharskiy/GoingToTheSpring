package SpringCoreFifthDay.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    private final String name1;
    private final String name2;

    @Autowired
    public AppService(
            @Qualifier("name1") String name1,
            @Qualifier("name2") String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String printName1() {
        return name1;
    }

    public String printName2(){
        return name2;
    }


}
