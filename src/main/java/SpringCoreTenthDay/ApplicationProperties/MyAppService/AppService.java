package SpringCoreTenthDay.ApplicationProperties.MyAppService;

import SpringCoreTenthDay.ApplicationProperties.MyAppDb.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AppService {
    private final DataBase dataBase;

    @Autowired
    public AppService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @PostConstruct
    public void getAppInfo(){
        System.out.println("App Info: ");
        System.out.println(dataBase.getName());
        System.out.println(dataBase.getAdminEmail());
        System.out.println(dataBase.getEnvironment());
        System.out.println(dataBase.getVersion());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("AppService is destroyed");
    }

}

