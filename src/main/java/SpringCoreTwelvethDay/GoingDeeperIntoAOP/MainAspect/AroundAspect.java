package SpringCoreTwelvethDay.GoingDeeperIntoAOP.MainAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {

    @Around("execution(* SpringCoreTwelvethDay.GoingDeeperIntoAOP.AspectServices.AroundService.aspectService(..))")
    public Object aroundServiceMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Preparing");

        Object result = joinPoint.proceed();

        System.out.println("Postparing");
        return result;
    }
}
