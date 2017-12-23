package com.shao.system.service;

import com.shao.system.domain.Tree;
import com.shao.system.domain.MenuDo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@Service
public interface MenuService {
    Tree<MenuDo> getSysMenuTree(Long id);
    List<Tree<MenuDo>> listMenuTree(Long id);

}
