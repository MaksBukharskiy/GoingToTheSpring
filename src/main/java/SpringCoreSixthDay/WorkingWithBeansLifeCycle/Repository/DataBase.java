package SpringCoreSixthDay.WorkingWithBeansLifeCycle.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DataBase {

    public void connect(){
        System.out.println("✅ Connecting to the database");
    }

    public void disconnect(){
        System.out.println("❌ Disconnecting from the database");
    }

    public void insertData(){
        System.out.println("Inserting data into the database");
    }

}
