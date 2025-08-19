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
    private String password;

    public UserDatabase() {}

    public UserDatabase(String username, String password) {
        this.username = username;
        this.password = password;
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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserDatabase [Id=" + Id +
                ", username=" + username
                + ", password="
                + password + "]";
    }
}
