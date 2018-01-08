package com.shao.autotest.service.impl;

import com.shao.autotest.dao.SuiteDAO;
import com.shao.autotest.domain.Suite;
import com.shao.autotest.service.SuiteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
public class SuiteServiceImpl implements SuiteService{
    @Autowired
    SuiteDAO suiteDAO;
    @Override
    public Integer save(Suite suite) {
        return null;
    }

    @Override
    public void updateSuiteName(String suiteId) {

    }

    @Override
    public void addCase(String caseId) {

    }

    @Override
    public void delCase(String caseId) {

    }

    @Override
    public Suite findOne(String suiteId) {
        return null;
    }

    @Override
    public List<Suite> findAll() {
        return null;
    }

    @Override
    public void exec(String suiteId) {

    }
}
