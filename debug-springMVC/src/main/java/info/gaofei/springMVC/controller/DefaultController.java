package info.gaofei.springMVC.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GaoQingming on 2018/11/18.
 */
@Controller
@RequestMapping("default")
public class DefaultController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("mapping")
    @ResponseBody
    public String mapping(HttpServletRequest request, ModelMap map, String param) {
        logger.info(param);
        return "result";
    }
}
