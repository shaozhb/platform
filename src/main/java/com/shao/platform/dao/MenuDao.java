package com.shao.platform.dao;

import com.shao.platform.domain.MenuDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@Mapper
public interface MenuDao {

    @Select("SELECT DISTINCT m.menu_id, parent_id, NAME, url, perms, `type`, icon, order_num, gmt_create, gmt_modified FROM sys_menu m LEFT JOIN sys_role_menu rm ON m.menu_id = rm.menu_id LEFT JOIN sys_user_role ur ON rm.role_id = ur.role_id WHERE ur.user_id = 1 AND m.type IN (0, 1) ORDER BY m.order_num")
    List<MenuDo>  listMenuByUserId(Long id);

}
