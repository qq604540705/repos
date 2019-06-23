package com.itheima.bean;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    private int cid;//分类id
    private String cname;//分类名称
    private List<Route> route;//旅游路线的具体信息

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Route> getRoute() {
        return route;
    }

    public void setRoute(List<Route> route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "category{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", route=" + route +
                '}';
    }
}
