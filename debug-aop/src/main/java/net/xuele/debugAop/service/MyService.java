package net.xuele.debugAop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
}
