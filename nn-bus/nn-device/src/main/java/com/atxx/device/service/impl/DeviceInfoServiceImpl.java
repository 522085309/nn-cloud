package com.atxx.device.service.impl;

import com.atxx.device.domain.DeviceInfo;
import com.atxx.device.mapper.DeviceInfoMapper;
import com.atxx.device.service.IDeviceInfoService;
import com.atxx.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备信息Service业务层处理
 * 
 * @author decard
 * @date 2020-05-08
 */
@Service
public class DeviceInfoServiceImpl implements IDeviceInfoService
{
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    /**
     * 查询设备信息
     * 
     * @param id 设备信息ID
     * @return 设备信息
     */
    @Override
    public DeviceInfo selectDeviceInfoById(String id)
    {
        return deviceInfoMapper.selectDeviceInfoById(id);
    }

    /**
     * 查询设备信息列表
     * 
     * @param deviceInfo 设备信息
     * @return 设备信息
     */
    @Override
    public List<DeviceInfo> selectDeviceInfoList(DeviceInfo deviceInfo)
    {
        return deviceInfoMapper.selectDeviceInfoList(deviceInfo);
    }

    /**
     * 新增设备信息
     * 
     * @param deviceInfo 设备信息
     * @return 结果
     */
    @Override
    public int insertDeviceInfo(DeviceInfo deviceInfo)
    {
        deviceInfo.setCreateTime(DateUtils.getNowDate());
        return deviceInfoMapper.insertDeviceInfo(deviceInfo);
    }

    /**
     * 修改设备信息
     * 
     * @param deviceInfo 设备信息
     * @return 结果
     */
    @Override
    public int updateDeviceInfo(DeviceInfo deviceInfo)
    {
        deviceInfo.setUpdateTime(DateUtils.getNowDate());
        return deviceInfoMapper.updateDeviceInfo(deviceInfo);
    }

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息ID
     * @return 结果
     */
    @Override
    public int deleteDeviceInfoByIds(String[] ids)
    {
        return deviceInfoMapper.deleteDeviceInfoByIds(ids);
    }

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息ID
     * @return 结果
     */
    @Override
    public int deleteDeviceInfoById(String id)
    {
        return deviceInfoMapper.deleteDeviceInfoById(id);
    }

    @Override
    public int insertDdvices(List<DeviceInfo> deviceInfos) {
        return deviceInfoMapper.insertDeviceInfos(deviceInfos);
    }

    @Override
    public List<DeviceInfo> selectDeviceInfoByDevId(DeviceInfo deviceInfo) {
        return deviceInfoMapper.selectDeviceInfoByDevId(deviceInfo);
    }
}
