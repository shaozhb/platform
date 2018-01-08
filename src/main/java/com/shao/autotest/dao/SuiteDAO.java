package com.shao.autotest.dao;

import com.shao.autotest.domain.Suite;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
public interface SuiteDAO extends JpaRepository<Suite,String>{
}
