package net.xuele.initialize.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by GaoQingming on 2018/9/25.
 */
@Service
public class ServiceMixed {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int getNum(int i) {
        return i;
    }

    public void call() {
        logger.info("invoked");
    }

}
