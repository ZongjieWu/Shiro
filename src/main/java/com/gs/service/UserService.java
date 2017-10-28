package com.gs.service;

import com.gs.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/9/28.
 */
public interface UserService {

    User getByNamePwd(String name, String pwd);
}
