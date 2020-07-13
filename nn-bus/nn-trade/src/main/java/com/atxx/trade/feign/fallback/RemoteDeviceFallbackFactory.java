package com.atxx.trade.feign.fallback;

import com.atxx.trade.feign.RemoteDevcie;
import com.atxx.web.domain.AjaxResult;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author:XJ
 */
@Component
public class RemoteDeviceFallbackFactory implements FallbackFactory<RemoteDevcie> {
    @Override
    public RemoteDevcie create(Throwable throwable) {
        return new RemoteDevcie() {
            @Override
            public AjaxResult checkDevice(String deviceId) {
                return AjaxResult.error();
            }
        };
    }
}
