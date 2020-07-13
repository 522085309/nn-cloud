package com.atxx.device.domain;

import com.atxx.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * sheb对象 dev_device_info
 *
 * @author decard
 * @date 2020-05-11
 */
public class DeviceInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;
//    private String yihuishandiao="23:59:59";
    /** 主键 */
    private String id;

    /** sn号 */
    private String deviceId;

    /** 设备类型 */
    private String deviceType;

    /** 设备状态，00禁用,01启用 */
    private String status;

    /** 部门id，用作数据隔离 */
//    @Excel(name = "部门id", type = Excel.Type.EXPORT)
    private Long deptId;

    /** 用户id */
//    @Excel(name = "用户id", type = Excel.Type.EXPORT)
    private Long userId;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId()
    {
        return deviceId;
    }
    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType()
    {
        return deviceType;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDeptId(Long deptId)
    {
        this.deptId = deptId;
    }

    public Long getDeptId()
    {
        return deptId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("deviceId", getDeviceId())
                .append("deviceType", getDeviceType())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("deptId", getDeptId())
                .append("userId", getUserId())
                .toString();
    }
}