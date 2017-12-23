package com.shao.common.service.impl;

import com.shao.common.dao.DictDAO;
import com.shao.common.domain.DictDO;
import com.shao.common.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
public class DictServiceImpl implements DictService {

    @Autowired
    DictDAO dictDAO;
    @Override
    public DictDO get(Long id) {
        return dictDAO.get(id);
    }

    @Override
    public List<DictDO> list(Map<String, Object> map) {
        return null;
    }

    @Override
    public int count(Map<String, Object> map) {
        return 0;
    }
}
