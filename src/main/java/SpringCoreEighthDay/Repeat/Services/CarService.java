package SpringCoreEighthDay.Repeat.Services;

import SpringCoreEighthDay.Repeat.Repository.CarDataBase;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CarService {
    private final CarDataBase carDataBase;

    @Autowired
    public CarService (CarDataBase carDataBase) {
        this.carDataBase = carDataBase;
    }

    @PostConstruct
    public void carOwner(){
        System.out.println("Car Owner: " + carDataBase.getCarOwnerName());
    }

    @PreDestroy
    public void carInfo() {
        System.out.println( "\n-----Info-----");
        System.out.println(carDataBase.getCarOwnerName());
        System.out.println(carDataBase.getCarName());
        System.out.println(carDataBase.getCarYear());
    }

    public void carName(){
        System.out.println("Car model: " + carDataBase.getCarName());
    }
}
