package SpringCoreFourthDay.GoingIntoTheBeans;

import SpringCoreFourthDay.GoingIntoTheBeans.Repository.Info;
import SpringCoreFourthDay.GoingIntoTheBeans.Repository.Price;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("SpringCoreFourthDay.GoingIntoTheBeans")
public class InfoConfiguration {

    @Bean
    public Info appInfo() {
        return new Info("Maks", "Bukharskiy");
    }

    @Bean
    public Price yourPrice(){
        return new Price(15.00);
    }

}
