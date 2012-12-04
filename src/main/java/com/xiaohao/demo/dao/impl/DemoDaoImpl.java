package com.xiaohao.demo.dao.impl;

import com.xiaohao.demo.dao.DemoDao;
import com.xiaohao.demo.model.Demo;
import com.xiaohao.base.dao.BaseDAO;

import org.springframework.stereotype.Repository;


@Repository
public class DemoDaoImpl extends BaseDAO<Demo, Integer> implements DemoDao {
    
}
