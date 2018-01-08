package com.shao.autotest.dao;

import com.shao.autotest.domain.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class SuiteDAOTest {
    @Autowired
    SuiteDAO suiteDAO;

    @Test
    public void testSave(){
        Suite suite=new Suite();
        suite.setSuiteId("2");
        suite.setSuiteName("联系人信息");
        suiteDAO.save(suite);
    }

}