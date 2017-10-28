package com.gs.dao;

import com.gs.bean.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/28.
 */
@Repository
public interface UserDAO {

    User getByNamePwd(@Param("name") String name, @Param("pwd") String pwd);

}
