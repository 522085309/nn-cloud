package com.atxx.controller;

import com.atxx.domain.DeviceInfo;
import com.atxx.service.IDeviceInfoService;
import com.atxx.web.controller.BaseController;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.page.TableDataInfo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 设备信息Controller
 *
 * @author decard
 * @date 2020-05-08
 */

@RestController
@RequestMapping("/equipment/deviceInfo")
public class DeviceInfoController extends BaseController {
    @Autowired
    private IDeviceInfoService deviceInfoService;

    /**
     * 查询设备信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(DeviceInfo deviceInfo) {
        startPage();
        List<DeviceInfo> list = deviceInfoService.selectDeviceInfoList(deviceInfo);
        return getDataTable(list);
    }

    /**
     * 获取设备信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(deviceInfoService.selectDeviceInfoById(id));
    }

    /**
     * 新增设备信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody DeviceInfo deviceInfo, HttpServletRequest request) {
        if(getTrue(deviceInfo)){
            return toAjax(deviceInfoService.insertDeviceInfo(deviceInfo));
        }else{
            return AjaxResult.error("设备号: "+deviceInfo.getDeviceId()+"  已存在");
        }
    }

    /**
     * 修改设备信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody DeviceInfo deviceInfo) {
        return toAjax(deviceInfoService.updateDeviceInfo(deviceInfo));
    }

    /**
     * 启用设备安装
     */
    @PostMapping("/updateStatus")
    public AjaxResult updateStatus(@RequestBody String[] ids) {
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            String status = deviceInfo.getStatus();
            if(!"00".equals(status) && !"02".equals(status)){
                return AjaxResult.error("新设备和备机才可以安装，设备号为:"+deviceInfo.getDeviceId()+"的设备不符合");
            }
        }
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            deviceInfo.setStatus("01");
            deviceInfoService.updateDeviceInfo(deviceInfo);
        }
        return AjaxResult.success("成功");
    }

    /**
     * 禁用设备维修
     */
    @PostMapping("/forbiddenDevice")
    public AjaxResult forbiddenDevice(@RequestBody String[] ids) {
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            String status = deviceInfo.getStatus();
            if(!"01".equals(status)){
                return AjaxResult.error("已安装设备才可以维修，设备号为:"+deviceInfo.getDeviceId()+"的设备不符合");
            }
        }
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            deviceInfo.setStatus("03");
            toAjax(deviceInfoService.updateDeviceInfo(deviceInfo));

        }
        return AjaxResult.success("成功");
    }

    /**
     * 备机设备
     */
    @PostMapping("/backUpDevice")
    public AjaxResult repairDevice(@RequestBody String[] ids) {
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            String status = deviceInfo.getStatus();
            if(!"00".equals(status) && !"03".equals(status)){
                return AjaxResult.error("新设备和维修中的才可以备机,设备号为:"+deviceInfo.getDeviceId()+"的设备不符合");
            }
        }
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            deviceInfo.setStatus("02");
            toAjax(deviceInfoService.updateDeviceInfo(deviceInfo));
        }
        return AjaxResult.success("成功");
    }

    /**
     * 报废设备
     */
    @PostMapping("/scrapDevice")
    public AjaxResult scrapDevice(@RequestBody String[] ids) {
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            String status = deviceInfo.getStatus();
            if(!"03".equals(status)){
                return AjaxResult.error("维修中的才可以报废,设备号为:"+deviceInfo.getDeviceId()+"的设备不符合");
            }
        }
        for (String id : ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            deviceInfo.setStatus("04");
            toAjax(deviceInfoService.updateDeviceInfo(deviceInfo));
        }
        return AjaxResult.success("成功");
    }


    /**
     * 删除设备信息
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        for (String id: ids) {
            DeviceInfo deviceInfo = deviceInfoService.selectDeviceInfoById(id);
            if(!"04".equals(deviceInfo.getStatus())){
                return AjaxResult.error("只能删除报废设备，设备号为:"+deviceInfo.getDeviceId()+"的设备不符合\"");
            }
        }

        return toAjax(deviceInfoService.deleteDeviceInfoByIds(ids));
    }


    /**
     * 查重方法 没有重复为true
     */
    public Boolean getTrue(DeviceInfo deviceInfo){
        List<DeviceInfo> deviceInfos = deviceInfoService.selectDeviceInfoByDevId(deviceInfo);
        if(deviceInfos.isEmpty()||deviceInfos==null) {
            return true;
        }
        return false;
    }
}
