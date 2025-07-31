package SpringCoreFourthDay.GoingIntoTheBeans.Repository;

import org.springframework.stereotype.Repository;

public class Info {
    private final String name;
    private final String description;

    public Info(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Description: " + description;
    }
}
