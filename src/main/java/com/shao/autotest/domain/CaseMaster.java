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
public class CaseMaster {

    @Id
    private String caseId;
    private String caseName;
    private String authorName;
    private Date createTime;
    private Date updateTime;


}
