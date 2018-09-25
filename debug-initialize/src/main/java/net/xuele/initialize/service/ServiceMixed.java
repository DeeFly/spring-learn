package net.xuele.initialize.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by GaoQingming on 2018/9/25.
 */
public class ServiceMixed {
    @Autowired
    private ServiceAnnotation serviceAnnotation;
    private ServiceXML serviceXML;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int getNum(int i) {
        return i;
    }

    public void call() {
        logger.info("getNum 3:{}", serviceAnnotation.getNum(3));
        logger.info("getNum 3:{}", serviceXML.getNum(3));
    }

    public ServiceXML getServiceXML() {
        return serviceXML;
    }

    public void setServiceXML(ServiceXML serviceXML) {
        this.serviceXML = serviceXML;
    }
}
