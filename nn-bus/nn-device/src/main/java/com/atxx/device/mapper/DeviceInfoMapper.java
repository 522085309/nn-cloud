package com.atxx.device.mapper;


import com.atxx.device.domain.DeviceInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * deviceInfoMapper接口
 *
 * @author decard
 * @date 2020-05-09
 */
@Mapper
public interface DeviceInfoMapper
{
    /**
     * 查询deviceInfo
     *
     * @param id deviceInfoID
     * @return deviceInfo
     */
    public DeviceInfo selectDeviceInfoById(String id);

    /**
     * 查询deviceInfo列表
     *
     * @param deviceInfo deviceInfo
     * @return deviceInfo集合
     */
    public List<DeviceInfo> selectDeviceInfoList(DeviceInfo deviceInfo);

    /**
     * 新增deviceInfo
     *
     * @param deviceInfo deviceInfo
     * @return 结果
     */
    public int insertDeviceInfo(DeviceInfo deviceInfo);

    /**
     * 修改deviceInfo
     *
     * @param deviceInfo deviceInfo
     * @return 结果
     */
    public int updateDeviceInfo(DeviceInfo deviceInfo);

    /**
     * 删除deviceInfo
     *
     * @param id deviceInfoID
     * @return 结果
     */
    public int deleteDeviceInfoById(String id);

    /**
     * 批量删除deviceInfo
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceInfoByIds(String[] ids);
    /**
     * 批量新增deviceInfo
     *
     * @param list 需要删除的数据ID
     * @return 结果
     */
    int insertDeviceInfos(List<DeviceInfo> list);
    /**
     * 根据devid查询deviceInfo
     *
     * @param deviceInfo 需要chaxun的数据deviceInfo
     * @return 结果
     */
    List<DeviceInfo> selectDeviceInfoByDevId(DeviceInfo deviceInfo);
}