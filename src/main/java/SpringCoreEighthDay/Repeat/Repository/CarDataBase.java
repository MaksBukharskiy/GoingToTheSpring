package SpringCoreEighthDay.Repeat.Repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CarDataBase {

    @Value("${car.name}")
    private String carName;

    @Value("${car.year}")
    private String carYear;

    @Value("${car.owner}")
    private String carOwnerName;


    public String getCarName() {
        return carName;
    }

    public String getCarOwnerName() {
        String carOwnerName1 = carOwnerName;
        return carOwnerName;
    }

    public String getCarYear() {
        String carYear1 = carYear;
        return carYear;
    }

}
