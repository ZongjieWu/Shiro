package com.gs.service;

import com.gs.bean.Permission;

import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 */
public interface PermissionService {

    List<String> listPermissions(String username);

    List<Permission> listByModule(Integer moduleId);

}
