package BeansPractice.Practice.Repository;

import BeansPractice.Practice.Service.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class CoffeeService {
    private final CoffeeRepository database;

    @Autowired
    public CoffeeService(CoffeeRepository database) {
        this.database = database;
    }

    @PostConstruct
    public void init(){
        database.coffeeStart();
    }

    @PreDestroy
    public void destroy(){
        database.coffeeEnd();
    }

}
