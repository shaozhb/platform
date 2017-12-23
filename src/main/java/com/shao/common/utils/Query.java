package com.shao.common.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhibin.shao on 2017/12/23.
 */
public class Query extends LinkedHashMap<String,Object>{
    private static final long serialVersionUID=1L;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    //总条数
    private int offset;

    //每页条数
    private int limit;

    public Query(Map<String,Object> params){
        this.putAll(params);
        //分页参数

        this.offset=Integer.parseInt(params.get("offset").toString());
        this.limit=Integer.parseInt(params.get("limit").toString());
        this.put("offset",offset);
        this.put("limit",limit);
        this.put("page",offset/limit+1);
    }
}
