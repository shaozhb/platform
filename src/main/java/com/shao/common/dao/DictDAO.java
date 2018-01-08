package com.shao.common.dao;

import com.shao.common.domain.DictDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
@Mapper
public interface DictDAO {

    DictDO get(Long id);



}
