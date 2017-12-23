package com.shao.common.utils;

import sun.dc.pr.PRError;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
public class PageUtils  implements Serializable{

    public static final  long serialVersionUID=1L;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    //总记录数
    private int total;
    //列表数据
    private List<?> rows;


    public PageUtils(List<?> list,int total){
        this.total=total;
        this.rows=list;
    }



}
