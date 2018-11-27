package info.gaofei.springMVC.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by GaoQingming on 2018/11/26.
 */
@Service
public class MyService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public String getString() {
        return "gaofei";
    }
}
