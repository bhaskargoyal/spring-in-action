package chapter.oneTwoThree.ex1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author bgoyal
 */

@Aspect
@EnableAspectJAutoProxy
public class MinstrelAspect {
    static {
        System.out.println("sdfjsd");
    }

    @Pointcut("execution(* chapter.oneTwoThree.knight.*.embarkOnQuest(..))")
    private void embark() {
    }

    @Before("embark()")
    public void beforeAdviceEmbarkOnQuest(JoinPoint joinPoint) {
        System.out.println("ertwer");
    }

    @After("embark()")
    public void afterAdviceEmbarkOnQuest(JoinPoint joinPoint) {
        System.out.println("fghgffsd");
    }
}


