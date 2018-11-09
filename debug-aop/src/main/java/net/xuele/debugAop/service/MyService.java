package net.xuele.debugAop.service;

import net.xuele.debugAop.param.AParam;
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

    public int getNum(AParam param) {
        logger.info("param : {} ", param.getS());
        return 1;
    }

    public int selectNum(Integer i) {
        return i;
    }

    public int other(int i) {
        logger.info("调用本类中的被增强的方法，开始=========================================");
        //logger.info("{}", selectNum(1));
        logger.info("{}", ((MyService) AopContext.currentProxy()).selectNum(1));
        logger.info("调用本类中的被增强的方法，结束=========================================");
        return i;
    }
}
