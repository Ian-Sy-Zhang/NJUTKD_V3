package com.nju.tkd.bl;

import com.nju.tkd.dao.UserMapper;
import com.nju.tkd.po.User;
import com.nju.tkd.po.UserFrom;
import com.nju.tkd.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServicelmpl implements UserService {

    private final static String ACCOUNT_EXIST = "账号已存在";
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseVO registerAccount(UserFrom userFrom) {
        try {
            userMapper.createNewAccount(userFrom.getId(), userFrom.getName(),userFrom.getPassword());
        } catch (Exception e) {
            return ResponseVO.buildFailure(ACCOUNT_EXIST);
        }
        return ResponseVO.buildSuccess();
    }

    @Override
    public UserFrom login(UserFrom userForm) {
        UserFrom User = userMapper.getAccountByid(userForm.getId());
        if (null == User || !User.getPassword().equals(userForm.getPassword())) {
            return null;
        }
        return User;
    }

    @Override
    public boolean updateTrain(UserFrom userForm) {
        return false;
    }
}
