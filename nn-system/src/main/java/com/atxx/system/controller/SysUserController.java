package com.atxx.system.controller;

import com.atxx.domain.system.SysUser;
import com.atxx.system.service.SysUserService;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.domain.R;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:XJ
 */
@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping(value = "userName/{userName}",method = RequestMethod.GET)
    public R<SysUser> getUser(@PathVariable(value = "userName") String userName){
        QueryWrapper<SysUser> wrapper = new QueryWrapper<SysUser>();
        SysUser sysUser = sysUserService.getOne(wrapper.lambda().eq(SysUser::getUserName, userName));
        return R.ok(sysUser);
    }

}
