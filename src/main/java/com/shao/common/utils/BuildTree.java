package com.shao.common.utils;

import com.shao.system.domain.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
public class BuildTree {
    public  static <T> Tree<T>build(List<Tree<T>> nodes){
        if(nodes == null){
            return null;
        }

        List<Tree<T>> topsNodes=new ArrayList<Tree<T>>();

        for(Tree<T> chrildren:nodes){
            String pid=chrildren.getParentId();
            if(pid==null||"0".equals(pid)){
                topsNodes.add(chrildren);
                continue;
            }

            for(Tree<T> parent:nodes){
                String id=parent.getId();
                if(id!=null||id.equals(pid)){
                    parent.getChildren().add(chrildren);
                    chrildren.setHasParent(true);
                    parent.setHasChild(true);
                    continue;
                }
            }
        }
        Tree<T> root=new Tree<T>();
        if(topsNodes.size()==1){
            root=topsNodes.get(0);
        }else{
            root.setId("-1");
            root.setParentId("");
            root.setHasParent(false);
            root.setHasChild(true);
            root.setChildren(topsNodes);
            root.setText("顶级节点");
            root.setChecked(true);
            Map<String,Object> state=new HashMap<>(16);
            state.put("open",true);
            root.setState(state);
        }
        return  root;
    }


    public static <T> List<Tree<T>> buildList(List<Tree<T>> nodes, String idParam) {
        if (nodes == null) {
            return null;
        }
        List<Tree<T>> topNodes = new ArrayList<Tree<T>>();

        for (Tree<T> children : nodes) {

            String pid = children.getParentId();
            if (pid == null || idParam.equals(pid)) {
                topNodes.add(children);

                continue;
            }

            for (Tree<T> parent : nodes) {
                String id = parent.getId();
                if (id != null && id.equals(pid)) {
                    parent.getChildren().add(children);
                    children.setHasParent(true);
                    parent.setHasChild(true);

                    continue;
                }
            }

        }
        return topNodes;
    }
}
