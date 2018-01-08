package com.shao.autotest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
@Entity
@Data
public class CaseCheck {

    @Id
    private String checkId;
    private String stepId;
    private String chenckSql;
    private String resultExpect;
    private String resultActual;
    private String createTime;
    private String updateTime;


}
