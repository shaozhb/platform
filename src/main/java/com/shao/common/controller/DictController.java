package com.shao.common.controller;

import com.shao.common.domain.DictDO;
import com.shao.common.service.DictService;
import com.shao.common.utils.PageUtils;
import com.shao.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
@Controller
@RequestMapping("/common/sysDict")
public class DictController {

    @Autowired
    DictService sysDictService;

    @ResponseBody
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String,Object> params){

        Query query=new Query(params);
        List<DictDO> sysDictList=sysDictService.list(query);
        int total=sysDictService.count(query);
        PageUtils pageUtils=new PageUtils(sysDictList,total);
        return pageUtils;

    }

    @GetMapping("/add")
    String add(){
        return  "common/sysDict/add";
    }

    @GetMapping("/edit{id}")
    String edit(@PathVariable("id") Long id, Model model){
    DictDO sysDict=sysDictService.get(id);
    model.addAttribute("sysDict",sysDict);
        return "common/sysDict/edit";
    }

//    @ResponseBody
//    @PostMapping("/save")







}
