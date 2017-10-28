package com.gs.service;

import com.gs.bean.Role;

import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 */
public interface RoleService {

    List<String> listRoles(String username);

    List<Role> list();

}
