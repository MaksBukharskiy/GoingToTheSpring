package SpringCoreEleventhDay.AspectLearning.NewAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {

    @Before("execution(* SpringCoreEleventhDay.AspectLearning.AppService.*.*(..))")
    public void beforeAnyService(){
        System.out.println("Before any service");
    }
}
