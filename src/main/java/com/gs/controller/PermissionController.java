package com.gs.controller;

import com.gs.bean.Permission;
import com.gs.bean.ZTree;
import com.gs.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("page")
    public String permissionPage() {
        return "permission";
    }

    @PostMapping("by_module")
    @ResponseBody
    public List<ZTree> permissionsByModule(Integer mid) {
        System.out.println(mid);
        List<Permission> permissionList = permissionService.listByModule(mid);
        List<ZTree> zTreeList = new ArrayList<ZTree>();
        for (Permission p : permissionList) {
            zTreeList.add(new ZTree(p.getId(), mid, p.getDesZh(), false, false, true));
        }
        return zTreeList;
    }

}
