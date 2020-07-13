package com.atxx.system.service.impl;

import com.atxx.domain.system.SysMenu;
import com.atxx.domain.system.SysRole;
import com.atxx.system.mapper.SysMenuMapper;
import com.atxx.system.mapper.SysRoleMapper;
import com.atxx.system.service.SysMenuService;
import com.atxx.system.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author:XJ
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper,SysMenu> implements SysMenuService {
}
