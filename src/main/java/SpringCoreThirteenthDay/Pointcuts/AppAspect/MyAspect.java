package SpringCoreThirteenthDay.Pointcuts.AppAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("within(SpringCoreThirteenthDay.Pointcuts.Services..*)")
    public void beforeService(JoinPoint joinPoint) {
        System.out.println("Before Service");
        System.out.println("------- -------");
    }

    @After("args(String) && within(SpringCoreThirteenthDay.Pointcuts.Services..*)")
    public void afterService(JoinPoint joinPoint) {
        System.out.println("After Service");
        System.out.println("------- -------");
    }

}
