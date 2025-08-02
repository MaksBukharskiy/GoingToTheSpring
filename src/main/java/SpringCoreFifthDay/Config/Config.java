package SpringCoreFifthDay.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringCoreFifthDay.Service")
public class Config {

    @Bean("name1")
    public String printName1(){
        return "Spring Core Fifth Day 1";
    }

    @Bean("name2")
    public String printName2(){
        return "Spring Core Fifth Day 2";
    }

}
