package net.xuele.debugAop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by GaoQingming on 2018/11/20 0020.
 */
@Service
public class SecondService {
    @Autowired
    private net.xuele.debugAop.service.Service myService;

    public void invoke() {
        //System.out.println(myService.selectNum(2));
    }
}
