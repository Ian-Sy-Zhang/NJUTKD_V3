package com.nju.tkd.bl;

import com.nju.tkd.po.User;
import com.nju.tkd.vo.ResponseVO;
import com.nju.tkd.po.UserFrom;

public interface UserService {

    /**
     * 注册账号
     * @return
     */
    ResponseVO registerAccount(UserFrom userFrom);



    /**
     * 用户登录，登录成功会将用户信息保存再session中
     * @return
     */
    UserFrom login(UserFrom userForm);

    /**
     * 用户打卡，打卡成功会使得打卡次数加一，并且更新打卡日期数据
     * @param userForm
     * @return
     */
    boolean updateTrain(UserFrom userForm);

}
