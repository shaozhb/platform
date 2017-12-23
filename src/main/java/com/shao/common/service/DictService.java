package com.shao.common.service;

import com.shao.common.domain.DictDO;

import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
public interface DictService {

    DictDO get(Long id);

    List<DictDO> list(Map<String,Object> map);
    int count(Map<String,Object> map);

}
