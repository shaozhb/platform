package com.shao.system.controller;

import com.shao.system.domain.MenuDo;
import com.shao.system.domain.Tree;
import com.shao.system.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@RequestMapping("/sys/menu")
@Controller

public class MenuController {



    @Autowired
    MenuService menuService;

    @RequestMapping("/index")
    public String getIndex(Model model){

        List<Tree<MenuDo>> menus=menuService.listMenuTree(1L);
        model.addAttribute("menus",menus);
        model.addAttribute("name","abc");
        model.addAttribute("username","aaaa");
        return "index_v1";
    }

    @GetMapping("/main")
    public String getMain(){
        return "main";
    }
    @GetMapping("/mm")
    public String getin(){
        return "/autotest/atindex";
    }
    @RequestMapping("/nn")
    @ResponseBody
    public String getnn() {
return "";

    }

}
