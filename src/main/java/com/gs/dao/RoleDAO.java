package com.gs.dao;

import com.gs.bean.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 */
@Repository
public interface RoleDAO {

    List<Role> list();

    List<String> listRoles(String username);
}
