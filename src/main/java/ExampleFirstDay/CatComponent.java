package ExampleFirstDay;

import org.springframework.stereotype.Component;

@Component
public class CatComponent {
    private String name = "Barsik";

    public String getname(){
        return name;
    }
}
