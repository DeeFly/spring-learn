package net.xuele.debugAop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;


/**
 * Created by GaoQingming on 2018/9/26 0026.
 */
@Service
public class MyService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int getNum(int i) {
        return i;
    }

    public int selectNum(int i) {
        return i;
    }

    public int other(int i) {
        logger.info("调用本类中的被增强的方法，开始=========================================");
        //logger.info("{}", selectNum(1));
        logger.info("{}", ((MyService)AopContext.currentProxy()).selectNum(1));
        logger.info("调用本类中的被增强的方法，结束=========================================");
        return i;
    }
}
