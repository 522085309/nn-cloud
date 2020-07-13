package com.atxx.auth.feign.fallback;

import com.atxx.auth.feign.RemoteSystem;
import com.atxx.domain.system.SysRole;
import com.atxx.domain.system.SysUser;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.domain.R;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author:XJ
 */
@Component
public class RemoteSystemFallbackFactory implements FallbackFactory<RemoteSystem>{

    @Override
    public RemoteSystem create(Throwable throwable) {
        return new RemoteSystem() {
            @Override
            public R<SysUser> getUser(String userName) {
                return R.failed();
            }

            @Override
            public R<List<SysRole>> getRole(Long userId) {
                return R.failed();
            }
        };
    }
}
