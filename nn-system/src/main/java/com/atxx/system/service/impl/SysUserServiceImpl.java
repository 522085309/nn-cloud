package com.atxx.system.service.impl;

import com.atxx.domain.system.SysUser;
import com.atxx.system.mapper.SysUserMapper;
import com.atxx.system.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author:XJ
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {
}
