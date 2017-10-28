package com.gs.service;

import com.gs.bean.Module;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
public interface ModuleService {

    List<Module> list();

}
