package com.shao.platform.dao;

import com.shao.platform.domain.MenuDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@Mapper
public interface MenuDao {
    List<MenuDo>  listMenuByUserId(Long id);
}
