package com.itheima.domain;

/**
 * @Author 王磊
 * @Date 2019/6/3/003
 */
public class QueryVo {
    private User user ;
    private Integer[] ids ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
}
