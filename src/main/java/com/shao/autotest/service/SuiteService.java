package com.shao.autotest.service;

import com.shao.autotest.domain.Suite;

import java.util.List;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
public interface SuiteService {

    //创建集合
    Integer save(Suite suite);

    //修改集合名称
    void updateSuiteName(String suiteId);

    //添加测试用例
    void addCase(String caseId);

    //删除测试用例
    void delCase(String caseId);

    //查找一个
    Suite findOne(String suiteId);

    //查询所有
    List<Suite> findAll();

    //执行
    void exec(String suiteId);


}
