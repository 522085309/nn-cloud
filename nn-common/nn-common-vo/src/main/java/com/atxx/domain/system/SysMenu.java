package com.atxx.domain.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author:XJ
 */
@TableName(value = "sys_menu")
public class SysMenu {
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;
    @TableField(value = "menu_name")
    private String menuName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
