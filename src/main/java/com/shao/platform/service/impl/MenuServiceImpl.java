package com.shao.platform.service.impl;

import com.shao.platform.common.utils.BuildTree;
import com.shao.platform.dao.MenuDao;
import com.shao.platform.domain.MenuDo;
import com.shao.platform.domain.Tree;
import com.shao.platform.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    MenuDao menuMapper;
    @Override
    public Tree<MenuDo> getSysMenuTree(Long id) {
        List<Tree<MenuDo>> trees=new ArrayList<Tree<MenuDo>>();
        List<MenuDo> menuDos=menuMapper.listMenuByUserId(id);
            for(MenuDo menudo:menuDos){
                Tree<MenuDo> tree=new Tree<MenuDo>();
                tree.setId(menudo.getMenuId().toString());
                tree.setParentId(menudo.getParentId().toString());
                tree.setText(menudo.getName());
                Map<String,Object> attributes=new HashMap<>(16);
                attributes.put("url",menudo.getUrl().toString());
                attributes.put("icon",menudo.getIcon().toString());
                tree.setAttributes(attributes);
                trees.add(tree);
            }
            Tree<MenuDo> t= BuildTree.build(trees);
        return t;
    }

    @Override
    public List<Tree<MenuDo>> listMenuTree(Long id) {
        return null;
    }
}
