package net.xuele.debugAop.aop;

import net.xuele.debugAop.param.AParam;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by GaoQingming on 2017/9/8 0008.
 */
@Component
@Aspect
public class MyAopTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* net.xuele.debugAop.service..get*(..)) && @within(org.springframework.stereotype.Service)")
    public void pointCut(){}

    @Pointcut("pointCut() && args(aParam)")
    public void pointCutWithParam(AParam aParam){}


    @Pointcut("execution(* net.xuele.debugAop.service..select*(..))")
    public void selectPointCut(){}

    /**
     *
     * IllegalArgumentException: ProceedingJoinPoint is only supported for around advice
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("myAOPTest around come");
        Object object = joinPoint.proceed(joinPoint.getArgs());
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        if (object == null) return object;
        logger.info("myAOPTest around end");
        return object;
    }

    @Before(value = "pointCutWithParam(param)")
    public Object beforeInvoke(JoinPoint point, AParam param) throws Throwable {
        logger.info("myAOPTest come before invoke");
        logger.info("args==============================={}", param.getS());
        return null;
    }

    @Before(value = "selectPointCut() && args(in)")
    public Object beforeSelectInvoke(JoinPoint point, Integer in) throws Throwable {
        logger.info("myAOPTest come before invoke");
        logger.info("select args==============================={}", in);
        return null;
    }

    @After(value = "pointCut()")
    public Object afterInvoke(JoinPoint point) throws Throwable {
        logger.info("myAOPTest come after invoke");
        return null;
    }

    @AfterReturning(value = "pointCut()",returning="returnValue")
    public Object afterReturning(JoinPoint point, Object returnValue) throws Throwable {
        logger.info("myAOPTest come afterReturning invoke");
        return returnValue;
    }
}
