package SpringCoreFourteenthDay.SpringDataJPA.DataRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Friend {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    public Friend(){}

    public Friend(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
