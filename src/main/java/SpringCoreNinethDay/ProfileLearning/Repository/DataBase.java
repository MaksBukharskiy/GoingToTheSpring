package SpringCoreNinethDay.ProfileLearning.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DataBase {

    private String devMessage = "Hello Developer)";
    private String testMessage = "Hello Tester)";

    public String getDevMessage() {
        return devMessage;
    }

    public String getTestMessage() {
        return testMessage;
    }

}
