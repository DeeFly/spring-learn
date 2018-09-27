package net.xuele.initialize.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GaoQingming on 2018/9/24.
 */
public class ServiceXML {
    private ServiceAnnotation serviceAnnotation;
    private ServiceMixed serviceMixed;
    private Integer integer;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int getNum(int i) {
        return i;
    }

    public void call() {
        logger.info("getNum 3:{}", serviceAnnotation.getNum(3));
        logger.info("getNum 3:{}", serviceMixed.getNum(3));
        logger.info("integer :{} ", integer);
    }

    public void myInitMethod() {
        logger.info("circular reference serviceAnnotation : {} ===================这个没问题，虽然A此时没有依赖注入结束，但是这个方法没有用到A的依赖========", serviceAnnotation.getNum(2));
        logger.info("xml configuration init method invoked");

        // 循环依赖测试，A -> B  ，B -> A   先初始化A，依赖注入时触发B的初始化、实例化，
        // 在B中调用A中的无需依赖的或者已经注入的属性的方法没问题，
        // 但是B中调用A中未完成依赖注入的方法时就会报空指针异常了
        //serviceAnnotation.call();
    }

    public void printString(String s) {
        System.out.println(s);
    }

    public ServiceMixed getServiceMixed() {
        return serviceMixed;
    }

    public void setServiceMixed(ServiceMixed serviceMixed) {
        this.serviceMixed = serviceMixed;
    }

    public ServiceAnnotation getServiceAnnotation() {
        return serviceAnnotation;
    }

    public void setServiceAnnotation(ServiceAnnotation serviceAnnotation) {
        this.serviceAnnotation = serviceAnnotation;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
