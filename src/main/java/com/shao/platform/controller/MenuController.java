package com.shao.platform.controller;

import com.shao.platform.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhibin.shao on 2017/12/20.
 */
@RequestMapping("/sys/menu")
@Controller

public class MenuController {

    String prefix="/system/menu";

    @Autowired
    MenuService menuService;



}
