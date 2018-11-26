package net.xuele.debugAop.service;

import net.xuele.debugAop.param.AParam;

/**
 * Created by GaoQingming on 2018/11/20 0020.
 */
public abstract class AbstractService {
    public abstract int getNum(AParam param);

    public abstract int selectNum(Integer i);
}
