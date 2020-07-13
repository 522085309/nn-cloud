package com.atxx.auth.feign;

import com.atxx.auth.feign.fallback.RemoteSystemFallbackFactory;
import com.atxx.domain.system.SysRole;
import com.atxx.domain.system.SysUser;
import com.atxx.utils.constant.ServiceNameConstants;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author:XJ
 */
@FeignClient(contextId = "RemoteSystem",value = ServiceNameConstants.SYSTEM_SERVICE,fallback =RemoteSystemFallbackFactory.class)
public interface RemoteSystem {
    // 根据账号查询用户信息
    @RequestMapping(value = "system/userName/{userName}",method = RequestMethod.GET)
    public R<SysUser> getUser(@PathVariable(value = "userName") String userName);
    //  根据用户id查询角色
    @RequestMapping(value = "system/role/{userId}",method = RequestMethod.GET)
    public R<List<SysRole>> getRole(@PathVariable(value = "userId")Long userId);
}
