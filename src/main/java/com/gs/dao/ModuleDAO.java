package com.gs.dao;

import com.gs.bean.Module;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Repository
public interface ModuleDAO {

    List<Module> list();

}
