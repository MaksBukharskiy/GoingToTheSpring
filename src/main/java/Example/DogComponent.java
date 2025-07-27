package Example;

import org.springframework.stereotype.Component;

@Component
public class DogComponent {
    private String name = "Dog";

    public String getName() {
        return name;
    }
}
