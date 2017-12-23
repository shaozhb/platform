package com.shao.system.service.impl;

import com.shao.common.utils.BuildTree;
import com.shao.system.dao.MenuDao;
import com.shao.system.domain.MenuDo;
import com.shao.system.domain.Tree;
import com.shao.system.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
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
                attributes.put("url",menudo.getUrl());
                attributes.put("icon",menudo.getIcon());
                tree.setAttributes(attributes);
                trees.add(tree);
            }
            Tree<MenuDo> t= BuildTree.build(trees);
        return t;
    }

    @Override
    public List<Tree<MenuDo>> listMenuTree(Long id) {
        List<Tree<MenuDo>> trees=new ArrayList<Tree<MenuDo>>();
        List<MenuDo> menuDos=menuMapper.listMenuByUserId(1L);
        for(MenuDo menudo:menuDos){
            Tree<MenuDo> tree=new Tree<MenuDo>();
            tree.setId(menudo.getMenuId().toString());
            tree.setParentId(menudo.getParentId().toString());
            tree.setText(menudo.getName());
            Map<String,Object> attributes=new HashMap<>(16);
            attributes.put("url",menudo.getUrl());
            attributes.put("icon",menudo.getIcon());
            tree.setAttributes(attributes);
            trees.add(tree);
        }
        List<Tree<MenuDo>> list=BuildTree.buildList(trees,"0");
//        Tree<MenuDo> t= BuildTree.build(trees,0);
        return list;
    }
}


