package info.gaofei.springMVC.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by GaoQingming on 2018/11/18.
 */
public class DefaultExceptionHandler implements HandlerExceptionResolver, Ordered {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.info("exception handler invoked ");
        return null;
    }
}
