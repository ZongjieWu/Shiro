package com.gs.service.impl;

import com.gs.bean.Role;
import com.gs.dao.RoleDAO;
import com.gs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/29.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public List<String> listRoles(String username) {
        return roleDAO.listRoles(username);
    }

    public List<Role> list() {
        return roleDAO.list();
    }
}
