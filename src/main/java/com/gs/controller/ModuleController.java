package com.gs.controller;

import com.gs.bean.Module;
import com.gs.bean.Permission;
import com.gs.bean.ZTree;
import com.gs.service.ModuleService;
import com.gs.service.PermissionService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("all")
    @ResponseBody
    public List<ZTree> list() {
        List<Module> moduleList = moduleService.list();
        List<ZTree> zTreeList = new ArrayList<ZTree>();
        for (Module m : moduleList) {
            zTreeList.add(new ZTree(m.getId(), 0, m.getName(), false, true, false));
        }
        return zTreeList;
    }

}
