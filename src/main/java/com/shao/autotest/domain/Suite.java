package com.shao.autotest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhibin.shao on 2018/1/8.
 */
@Entity
@Data
public class Suite {


    @Id
    private String suiteId;
    private String suiteName;

}
