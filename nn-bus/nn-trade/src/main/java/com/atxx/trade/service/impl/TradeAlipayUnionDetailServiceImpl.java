package com.atxx.trade.service.impl;

import com.atxx.trade.domain.TradeAlipayUnionDetail;
import com.atxx.trade.mapper.TradeAlipayUnionDetailMapper;
import com.atxx.trade.service.ITradeAlipayUnionDetailService;
import com.atxx.utils.DateUtils;
import com.atxx.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 支付宝和银联交易明细Service业务层处理
 * 
 * @author decard
 * @date 2020-05-25
 */
@Service
public class TradeAlipayUnionDetailServiceImpl implements ITradeAlipayUnionDetailService
{
    @Autowired
    private TradeAlipayUnionDetailMapper tradeAlipayUnionDetailMapper;

    /**
     * 查询支付宝和银联交易明细
     * 
     * @param id 支付宝和银联交易明细ID
     * @return 支付宝和银联交易明细
     */
    @Override
    public TradeAlipayUnionDetail selectTradeAlipayUnionDetailById(String id)
    {
        return tradeAlipayUnionDetailMapper.selectTradeAlipayUnionDetailById(id);
    }

    /**
     * 查询支付宝和银联交易明细列表
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 支付宝和银联交易明细
     */
    @Override
    public List<TradeAlipayUnionDetail> selectTradeAlipayUnionDetailList(TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        return tradeAlipayUnionDetailMapper.selectTradeAlipayUnionDetailList(tradeAlipayUnionDetail);
    }

    /**
     * 查询支付宝和银联交易明细列表
     * 无数据隔离
     */
    public List<TradeAlipayUnionDetail> selectTradeAlipayUnionDetailListNoDataScope(TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        return tradeAlipayUnionDetailMapper.selectTradeAlipayUnionDetailList(tradeAlipayUnionDetail);
    }

    /**
     * 新增支付宝和银联交易明细
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 结果
     */
    @Override
    public int insertTradeAlipayUnionDetail(TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        tradeAlipayUnionDetail.setId(IdUtils.fastSimpleUUID());
        tradeAlipayUnionDetail.setCreateTime(DateUtils.getNowDate());
        return tradeAlipayUnionDetailMapper.insertTradeAlipayUnionDetail(tradeAlipayUnionDetail);
    }

    /**
     * 修改支付宝和银联交易明细
     * 
     * @param tradeAlipayUnionDetail 支付宝和银联交易明细
     * @return 结果
     */
    @Override
    public int updateTradeAlipayUnionDetail(TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        tradeAlipayUnionDetail.setUpdateTime(DateUtils.getNowDate());
        return tradeAlipayUnionDetailMapper.updateTradeAlipayUnionDetail(tradeAlipayUnionDetail);
    }

    /**
     * 批量删除支付宝和银联交易明细
     * 
     * @param ids 需要删除的支付宝和银联交易明细ID
     * @return 结果
     */
    @Override
    public int deleteTradeAlipayUnionDetailByIds(String[] ids)
    {
        return tradeAlipayUnionDetailMapper.deleteTradeAlipayUnionDetailByIds(ids);
    }

    /**
     * 删除支付宝和银联交易明细信息
     * 
     * @param id 支付宝和银联交易明细ID
     * @return 结果
     */
    @Override
    public int deleteTradeAlipayUnionDetailById(String id)
    {
        return tradeAlipayUnionDetailMapper.deleteTradeAlipayUnionDetailById(id);
    }
}
