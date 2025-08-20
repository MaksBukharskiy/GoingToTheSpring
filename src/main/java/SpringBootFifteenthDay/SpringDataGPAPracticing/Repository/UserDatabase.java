package SpringBootFifteenthDay.SpringDataGPAPracticing.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserDatabase {

    @Id
    @GeneratedValue
    private long Id;

    private String username;

    public UserDatabase() {
    }

    public UserDatabase(String username) {
        this.username = username;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "UserDatabase [" +
                "Id=" + Id +
                ", username=" + username
                + "]";
    }
}
