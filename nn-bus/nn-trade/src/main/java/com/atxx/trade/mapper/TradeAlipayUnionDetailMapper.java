package com.atxx.trade.mapper;

import com.atxx.trade.domain.TradeAlipayUnionDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 支付宝和银联交易明细Mapper接口
 * 
 * @author decard
 * @date 2020-05-25
 */
@Mapper
public interface TradeAlipayUnionDetailMapper 
{
    /**
     * 查询支付宝和银联交易明细
     * 
     * @param id 支付宝和银联交易明细ID
     * @return 支付宝和银联交易明细
     */
    public TradeAlipayUnionDetail selectTradeAlipayUnionDetailById(String id);

    /**
     * 查询支付宝和银联交易明细列表
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 支付宝和银联交易明细集合
     */
    public List<TradeAlipayUnionDetail> selectTradeAlipayUnionDetailList(TradeAlipayUnionDetail tradeAlipayUnionDetail);

    /**
     * 新增支付宝和银联交易明细
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 结果
     */
    public int insertTradeAlipayUnionDetail(TradeAlipayUnionDetail tradeAlipayUnionDetail);

    /**
     * 修改支付宝和银联交易明细
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 结果
     */
    public int updateTradeAlipayUnionDetail(TradeAlipayUnionDetail tradeAlipayUnionDetail);

    /**
     * 删除支付宝和银联交易明细
     * 
     * @param id 支付宝和银联交易明细ID
     * @return 结果
     */
    public int deleteTradeAlipayUnionDetailById(String id);

    /**
     * 批量删除支付宝和银联交易明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTradeAlipayUnionDetailByIds(String[] ids);
}
