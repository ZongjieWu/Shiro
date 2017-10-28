package com.gs.dao;

import com.gs.bean.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 */
@Repository
public interface PermissionDAO {

    List<String> listPermissions(String username);

    List<Permission> listByModule(Integer moduleId);

}
