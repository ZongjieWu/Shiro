package com.gs.controller;

import com.gs.bean.Role;
import com.gs.bean.Select2;
import com.gs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("all")
    @ResponseBody
    public List<Select2> list() {
        List<Role> roleList = roleService.list();
        List<Select2> select2List = new ArrayList<Select2>();
        for (Role role : roleList) {
            select2List.add(new Select2(role.getId().toString(), role.getName()));
        }
        return select2List;
    }


}
