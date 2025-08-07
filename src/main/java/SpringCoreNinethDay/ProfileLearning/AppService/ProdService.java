package SpringCoreNinethDay.ProfileLearning.AppService;

import SpringCoreNinethDay.ProfileLearning.Repository.DataBase;
import SpringCoreNinethDay.ProfileLearning.Repository.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class ProdService implements Weather {
    private final DataBase db;

    @Autowired
    public ProdService(DataBase db) {
        this.db = db;
    }

    @Override
    public String getWeather() {
        return db.getTestMessage();
    }

}
