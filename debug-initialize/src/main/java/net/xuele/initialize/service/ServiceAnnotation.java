package net.xuele.initialize.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by GaoQingming on 2018/9/25.
 */
@Service
public class ServiceAnnotation {
    @Autowired
    private ServiceMixed serviceMixed;
    private ServiceXML serviceXML;
    @Value("${integer}")
    private Integer integer;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public ServiceAnnotation(ServiceXML serviceXML) {
        this.serviceXML = serviceXML;
    }

    public int getNum(int i) {
        return i;
    }

    public void call() {
        logger.info("getNum 3:{}", serviceMixed.getNum(3));
        logger.info("getNum 3:{}", serviceXML.getNum(3));
        logger.info("@Value integer:{}", integer);
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy invoked========================================");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct invoked=====================================");
    }

}
