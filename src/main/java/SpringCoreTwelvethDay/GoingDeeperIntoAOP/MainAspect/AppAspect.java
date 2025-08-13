package SpringCoreTwelvethDay.GoingDeeperIntoAOP.MainAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {

    @Before("execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AppService.startEngine(..))")
    public void beforeEngine(JoinPoint joinPoint) {
        System.out.println("Before Engine");
    }

    @After("execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AppService.startEngine(..))")
    public void afterEngine(JoinPoint joinPoint) {
        System.out.println("After Engine");
    }

    @AfterReturning(
            pointcut = "execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AppService.startEngine(..))",
            returning = "result"
    )

    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning" + result);
    }

    @AfterThrowing(
            pointcut = "execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AppService.startEngine(..))",
            throwing = "ex"
    )

    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("After Throwing" + ex.getMessage());
    }

}
