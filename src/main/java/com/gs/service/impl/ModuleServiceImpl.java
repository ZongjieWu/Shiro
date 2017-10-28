package com.gs.service.impl;

import com.gs.bean.Module;
import com.gs.dao.ModuleDAO;
import com.gs.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleDAO moduleDAO;

    public List<Module> list() {
        return moduleDAO.list();
    }
}
