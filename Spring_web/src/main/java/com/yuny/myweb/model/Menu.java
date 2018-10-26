package com.yuny.myweb.model;

import java.util.List;

/**
 * 菜单对象
 */
public class Menu {
    // 菜单名
    private String name;
    // 拥有的子菜单列表
    private List<Menu> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
