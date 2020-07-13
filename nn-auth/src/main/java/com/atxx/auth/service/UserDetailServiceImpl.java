package com.atxx.auth.service;

import com.alibaba.fastjson.JSON;
import com.atxx.Exception.BusinessException;
import com.atxx.auth.feign.RemoteSystem;
import com.atxx.auth.user.LoginUser;
import com.atxx.domain.system.SysRole;
import com.atxx.domain.system.SysUser;
import com.atxx.utils.StringUtils;
import com.atxx.utils.constant.HttpStatus;
import com.atxx.web.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author:XJ
 */
@Service("UserDetailServiceImpl")
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private RemoteSystem remoteSystem;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String userName = s;
        SysUser sysUser = remoteSystem.getUser(userName).getData();
        if (StringUtils.isNull(sysUser)) {
            throw new BusinessException(HttpStatus.NOT_FOUND,"账号存在");
        }
        List<SysRole> sysRoleList = remoteSystem.getRole(sysUser.getId()).getData();
        Collection<SimpleGrantedAuthority> role = new HashSet<>();
        sysRoleList.stream().forEach(sysRole -> {
            role.add(new SimpleGrantedAuthority(sysRole.getRoleName()));
        });
        return new LoginUser(sysUser.getId(),sysUser.getUserName(),sysUser.getPassword(),role);
    }
}
