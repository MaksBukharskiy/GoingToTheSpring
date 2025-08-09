package SpringCoreTenthDay.ApplicationProperties.MyAppDb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:application.properties")
public class DataBase {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${app.environment}")
    private String environment;

    @Value("${app.admin.email}")
    private String adminEmail;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setVersion(String version){
        this.version=version;
    }

    public String getVersion(){
        return version;
    }

    public void setEnvironment(String environment){
        this.environment=environment;
    }

    public String getEnvironment(){
        return environment;
    }

    public void setAdminEmail(String adminEmail){
        this.adminEmail=adminEmail;
    }

    public String getAdminEmail(){
        return adminEmail;
    }
}

