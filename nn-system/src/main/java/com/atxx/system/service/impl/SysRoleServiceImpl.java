package com.atxx.system.service.impl;

import com.atxx.domain.system.SysRole;
import com.atxx.domain.system.SysUser;
import com.atxx.system.mapper.SysRoleMapper;
import com.atxx.system.mapper.SysUserMapper;
import com.atxx.system.service.SysRoleService;
import com.atxx.system.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author:XJ
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService {
}
