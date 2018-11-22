package net.xuele.debugAop.service;

import net.xuele.debugAop.param.AParam;

/**
 * Created by GaoQingming on 2018/11/20 0020.
 */
public interface Service {
    int getNum(AParam param);

    int selectNum(Integer i);
}
