package net.xuele.register.scan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Created by GaoQingming on 2018/9/25 0025.
 */
@Service
public class ScanTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ScanTest() {
        logger.info("scan success ================================================");
    }

    public void print(String string) {
        logger.info("print:{} ==================================================", string);
    }
}
