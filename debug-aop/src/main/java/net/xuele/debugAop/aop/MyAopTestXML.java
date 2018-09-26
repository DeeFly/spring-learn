package net.xuele.debugAop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GaoQingming on 2018/9/10 0010.
 */
public class MyAopTestXML {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public Object handleAop(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("myAOPTestXMLXMLXML around come");
        Object object = joinPoint.proceed(joinPoint.getArgs());
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        if (object == null) return object;
        logger.info("myAOPTestXMLXMLXML around end");
        return object;
    }
}
