package com.atxx.system.controller;

import com.atxx.domain.system.SysRole;
import com.atxx.domain.system.SysUserRole;
import com.atxx.system.service.SysRoleService;
import com.atxx.system.service.SysUserRoleService;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.domain.R;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:XJ
 */
@RestController
public class SysRoleController {
    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Autowired
    private SysRoleService sysRoleService;
    @RequestMapping(value = "/role/{userId}",method = RequestMethod.GET)
    public R<List<SysRole>> getRole(@PathVariable(value = "userId")Long userId){
        List<SysUserRole> sysUserRoles = sysUserRoleService.list(Wrappers.<SysUserRole>lambdaQuery().eq(SysUserRole::getUserId, userId));
        List<SysRole> sysRoleList = sysRoleService.list(Wrappers.<SysRole>lambdaQuery().in(SysRole::getId, sysUserRoles.stream().map(sysUserRole -> sysUserRole.getRoleId()).collect(Collectors.toList())));
        return R.ok(sysRoleList);
    }
}
