package net.xuele.initialize.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GaoQingming on 2018/9/24.
 */
public class ServiceXML {
    private ServiceAnnotation serviceAnnotation;
    private ServiceMixed serviceMixed;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int getNum(int i) {
        return i;
    }

    public void call() {
        logger.info("getNum 3:{}", serviceAnnotation.getNum(3));
        logger.info("getNum 3:{}", serviceMixed.getNum(3));
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
}
