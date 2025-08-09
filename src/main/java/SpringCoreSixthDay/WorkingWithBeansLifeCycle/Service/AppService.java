package SpringCoreSixthDay.WorkingWithBeansLifeCycle.Service;

import SpringCoreSixthDay.WorkingWithBeansLifeCycle.Repository.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

@Service
public class AppService{
    private final DataBase dataBase;

    @Autowired
    public AppService(DataBase dataBase){
        this.dataBase = dataBase;
    }

//    @PostConstruct
    public void init() {
        System.out.println("🟢 Сервис инициализирован");
    }

//    @PreDestroy
    public void cleanup() {
        System.out.println("🔴 Сервис завершает работу");
    }

    public void processData() {
        dataBase.insertData();
        System.out.println("🔄 Данные обработаны");
    }


}
