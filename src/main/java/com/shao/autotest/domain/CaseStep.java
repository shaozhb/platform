package com.shao.autotest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
@Entity
@Data
public class CaseStep {

    @Id
    private String stepId;
    private String caseId;
    private String stepName;
    private String keywordMethod;
    private String mode;
    private String locator;
    private String keyworldInput;
    private String condition;
    private String result;
    private Date createTime;
    private Date updateTime;


}
