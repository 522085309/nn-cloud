package com.atxx.trade.feign;

import com.atxx.trade.feign.fallback.RemoteDeviceFallbackFactory;
import com.atxx.utils.constant.ServiceNameConstants;
import com.atxx.web.domain.AjaxResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(contextId="RemoteDevcie",value = ServiceNameConstants.DEVICE_SERVICE,fallbackFactory = RemoteDeviceFallbackFactory.class)
public interface RemoteDevcie {
    /**
     * 查询设备
     */
    @RequestMapping(value = "equipment/deviceInfo/deviceId/{deviceId}",method = RequestMethod.GET)
    public AjaxResult checkDevice(@PathVariable("deviceId") String deviceId);
}
