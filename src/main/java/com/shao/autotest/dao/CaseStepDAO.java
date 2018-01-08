package com.shao.autotest.dao;

import com.shao.autotest.domain.CaseStep;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
public interface CaseStepDAO extends JpaRepository<CaseStep,String> {

}
