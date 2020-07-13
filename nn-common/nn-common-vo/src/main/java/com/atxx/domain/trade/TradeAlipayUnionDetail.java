package com.atxx.domain.trade;

import com.atxx.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 支付宝和银联交易明细对象 trade_alipay_union_detail
 * 
 * @author decard
 * @date 2020-05-25
 */
public class TradeAlipayUnionDetail extends BaseEntity
{
//    private static final long serialVersionUID = 1L;

    private String id;

    private Long deptId;

    private Long userId;

    /** 支付类型 */
    private String guestId;


    /** 设备ID */
    private String deviceId;

    /** 渠道 */
    private String tradeType;

    /** 用户ID */
    private String tradeUserId;

    /** 钱包ID */
    private String transitWalletId;

    /** 行程订单号 */
    private String outTripNo;

    /** 扫码时间 */
    private String scanQrTime;

    /** 业务类型  */
    private String tripType;

    /** 进站二维码凭证号 */
    private String voucherNo;

    /** 进站二维码 */
//    @Excel(name = "进站二维码")
    private String qrcData;

    /** BCP设备id */
    private String bcpDeviceId;

    /** 巴士车牌号 */
    private String busNum;

    /** 巴士路线编号 */
    private String routeNo;

    /** 八达通路线编号 */
    private String routeId;

    /** 票价计费版本 */
    private String fareVersion;

    /** 行车方向 */
    private String bound;

    /** 站点编号 */
    private String stgnr;

    /** 乘客类型 */
    private String fareType;

    /** 即将停止的标识符 */
    private String stopId;

    /** GPS经度 */
    private String longitudeGps;

    /** GPS纬度 */
    private String latitudeGps;

    /** 成人票价 */
//    @Excel(name = "成人票价")
    private Long adultFare;
    private String adultFareYuan;

    /** 实际票价 */
//    @Excel(name = "实际票价")
    private Integer realFare;
    private String realFareYuan;

    /** 终端ip */
    private String mchCreateIp;

    /** 状态 */
    private String status;

    /** 去重字段 */
    private String distinctFiled;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
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

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }
    public void setTradeType(String tradeType) 
    {
        this.tradeType = tradeType;
    }

    public String getTradeType() 
    {
        return tradeType;
    }
    public void setTradeUserId(String tradeUserId) 
    {
        this.tradeUserId = tradeUserId;
    }

    public String getTradeUserId() 
    {
        return tradeUserId;
    }
    public void setTransitWalletId(String transitWalletId) 
    {
        this.transitWalletId = transitWalletId;
    }

    public String getTransitWalletId() 
    {
        return transitWalletId;
    }
    public void setOutTripNo(String outTripNo) 
    {
        this.outTripNo = outTripNo;
    }

    public String getOutTripNo() 
    {
        return outTripNo;
    }
    public void setScanQrTime(String scanQrTime) 
    {
        this.scanQrTime = scanQrTime;
    }

    public String getScanQrTime() 
    {
        return scanQrTime;
    }
    public void setTripType(String tripType) 
    {
        this.tripType = tripType;
    }

    public String getTripType() 
    {
        return tripType;
    }
    public void setVoucherNo(String voucherNo) 
    {
        this.voucherNo = voucherNo;
    }

    public String getVoucherNo() 
    {
        return voucherNo;
    }
    public void setQrcData(String qrcData) 
    {
        this.qrcData = qrcData;
    }

    public String getQrcData() 
    {
        return qrcData;
    }
    public void setBcpDeviceId(String bcpDeviceId) 
    {
        this.bcpDeviceId = bcpDeviceId;
    }

    public String getBcpDeviceId() 
    {
        return bcpDeviceId;
    }
    public void setBusNum(String busNum) 
    {
        this.busNum = busNum;
    }

    public String getBusNum() 
    {
        return busNum;
    }
    public void setRouteNo(String routeNo) 
    {
        this.routeNo = routeNo;
    }

    public String getRouteNo() 
    {
        return routeNo;
    }
    public void setRouteId(String routeId) 
    {
        this.routeId = routeId;
    }

    public String getRouteId() 
    {
        return routeId;
    }
    public void setFareVersion(String fareVersion) 
    {
        this.fareVersion = fareVersion;
    }

    public String getFareVersion() 
    {
        return fareVersion;
    }
    public void setBound(String bound) 
    {
        this.bound = bound;
    }

    public String getBound() 
    {
        return bound;
    }
    public void setStgnr(String stgnr) 
    {
        this.stgnr = stgnr;
    }

    public String getStgnr() 
    {
        return stgnr;
    }
    public void setFareType(String fareType) 
    {
        this.fareType = fareType;
    }

    public String getFareType() 
    {
        return fareType;
    }
    public void setStopId(String stopId) 
    {
        this.stopId = stopId;
    }

    public String getStopId() 
    {
        return stopId;
    }
    public void setLongitudeGps(String longitudeGps) 
    {
        this.longitudeGps = longitudeGps;
    }

    public String getLongitudeGps() 
    {
        return longitudeGps;
    }
    public void setLatitudeGps(String latitudeGps) 
    {
        this.latitudeGps = latitudeGps;
    }

    public String getLatitudeGps() 
    {
        return latitudeGps;
    }
    public void setAdultFare(Long adultFare) 
    {
        this.adultFare = adultFare;
    }

    public Long getAdultFare() 
    {
        return adultFare;
    }
    public void setRealFare(Integer realFare) 
    {
        this.realFare = realFare;
    }

    public Integer getRealFare() 
    {
        return realFare;
    }
    public void setMchCreateIp(String mchCreateIp) 
    {
        this.mchCreateIp = mchCreateIp;
    }

    public String getMchCreateIp() 
    {
        return mchCreateIp;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDistinctFiled(String distinctFiled) 
    {
        this.distinctFiled = distinctFiled;
    }

    public String getDistinctFiled() 
    {
        return distinctFiled;
    }

    public String getAdultFareYuan() {
        return adultFareYuan;
    }

    public void setAdultFareYuan(String adultFareYuan) {
        this.adultFareYuan = adultFareYuan;
    }

    public String getRealFareYuan() {
        return realFareYuan;
    }

    public void setRealFareYuan(String realFareYuan) {
        this.realFareYuan = realFareYuan;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deptId", getDeptId())
            .append("userId", getUserId())
            .append("payType", getGuestId())
            .append("deviceId", getDeviceId())
            .append("tradeType", getTradeType())
            .append("tradeUserId", getTradeUserId())
            .append("transitWalletId", getTransitWalletId())
            .append("outTripNo", getOutTripNo())
            .append("scanQrTime", getScanQrTime())
            .append("tripType", getTripType())
            .append("voucherNo", getVoucherNo())
            .append("qrcData", getQrcData())
            .append("bcpDeviceId", getBcpDeviceId())
            .append("busNum", getBusNum())
            .append("routeNo", getRouteNo())
            .append("routeId", getRouteId())
            .append("fareVersion", getFareVersion())
            .append("bound", getBound())
            .append("stgnr", getStgnr())
            .append("fareType", getFareType())
            .append("stopId", getStopId())
            .append("longitudeGps", getLongitudeGps())
            .append("latitudeGps", getLatitudeGps())
            .append("adultFare", getAdultFare())
            .append("realFare", getRealFare())
            .append("mchCreateIp", getMchCreateIp())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("distinctFiled", getDistinctFiled())
            .toString();
    }
}
