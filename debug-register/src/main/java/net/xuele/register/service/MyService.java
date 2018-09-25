package net.xuele.register.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by GaoQingming on 2018/9/24.
 */
public class MyService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public MyService(String string, Integer integer, List<String> list, Map<String,String> map) {
        logger.info("string:{}", string);
        logger.info("integer:{}", integer);
        logger.info("list:{}", list.size());
        logger.info("map:{}", map.size());
    }
    public void printString(String s) {
        logger.info("print:{} ====================================================", s);
    }
}
