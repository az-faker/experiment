package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author faker
 * @date 2018/6/29
 */
@Component
@Aspect
public class aopAdvice {

    @Pointcut("@annotation(aop.FakerAnnotation)")
    public void sayings() {
    }

    @Before(value = "sayings()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("注解类型前置通知");
    }

    @After(value = "sayings()")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("注解类型后置通知");
    }

    //环绕通知。注意要有ProceedingJoinPoint参数传入。
    @Around("sayings()")
    public void sayAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("注解类型环绕通知..环绕前");
        pjp.proceed();//执行方法
        System.out.println("注解类型环绕通知..环绕后");
    }

}
