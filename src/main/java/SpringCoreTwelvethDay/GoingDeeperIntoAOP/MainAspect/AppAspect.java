package SpringCoreTwelvethDay.GoingDeeperIntoAOP.MainAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {

    @Before("execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AppService.startEngine(..))")
    public void beforeEngine(JoinPoint joinPoint) {
        System.out.println("Before Engine");
    }

    @After("execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AppService.startEngine(..))")
    public void afterEngine(JoinPoint joinPoint) {
        System.out.println("After Engine");
    }

    @AfterReturning(
            pointcut = "execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AppService.startEngine(..))",
            returning = "result"
    )

    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning" + result);
    }

}
