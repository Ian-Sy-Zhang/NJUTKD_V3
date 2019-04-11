package com.nju.tkd.dao;

import com.nju.tkd.po.User;
import com.nju.tkd.po.UserFrom;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 创建一个新的账号
     * @param id
     * @param name
     * @param password
     * @return
     */
    int createNewAccount(@Param("id") String id, @Param("name") String name ,@Param("password") String password);


    /**
     * 根据学号查找账号
     * @param id
     * @return
     */
    UserFrom getAccountByid(@Param("id") String id);

    /**
     * 改变相关账户的训练次数以及训练日期
     * @param id
     * @param trainingTimes
     * @param trainingDate
     * @return
     */
    int updateTrainingData(@Param("id") String id, @Param("trainingTimes") int trainingTimes, @Param("trainingDate") String trainingDate);
}
