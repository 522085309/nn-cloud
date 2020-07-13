package com.atxx.trade.controller;

import com.atxx.trade.domain.TradeAlipayUnionDetail;
import com.atxx.trade.feign.RemoteDevcie;
import com.atxx.trade.service.ITradeAlipayUnionDetailService;
import com.atxx.web.controller.BaseController;
import com.atxx.web.domain.AjaxResult;
import com.atxx.web.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 支付宝和银联交易明细Controller
 *
 * @author decard
 * @date 2020-05-25
 */
@RestController
@RequestMapping("/aliPay")
public class TradeAlipayUnionDetailController extends BaseController
{
    @Autowired
    private ITradeAlipayUnionDetailService tradeAlipayUnionDetailService;
    @Autowired
    private RemoteDevcie remoteDevcie;

    /**
     * 查询支付宝和银联交易明细列表
     */
    @GetMapping("/list")
    public TableDataInfo list(TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        startPage();
        List<TradeAlipayUnionDetail> list = tradeAlipayUnionDetailService.selectTradeAlipayUnionDetailList(tradeAlipayUnionDetail);
        return getDataTable(list);
    }

    /**
     * 获取支付宝和银联交易明细详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(tradeAlipayUnionDetailService.selectTradeAlipayUnionDetailById(id));
    }

    /**
     * 新增支付宝和银联交易明细
     */
    @PostMapping
    public AjaxResult add(@RequestBody TradeAlipayUnionDetail tradeAlipayUnionDetail)
    {
        boolean b = (boolean) remoteDevcie.checkDevice(tradeAlipayUnionDetail.getDeviceId()).get(AjaxResult.DATA_TAG);
        if (b){
            return AjaxResult.error("设备号不存在");
        }
        return toAjax(tradeAlipayUnionDetailService.insertTradeAlipayUnionDetail(tradeAlipayUnionDetail));
    }

    /**
     * 修改支付宝和银联交易明细
     */
//    @PreAuthorize("@ss.hasPermi('trade:aliPay:edit')")
//    @Log(title = "支付宝和银联交易明细", businessType = BusinessType.UPDATE)
//    @PutMapping
//    public AjaxResult edit(@RequestBody TradeAlipayUnionDetail tradeAlipayUnionDetail)
//    {
//        return toAjax(tradeAlipayUnionDetailService.updateTradeAlipayUnionDetail(tradeAlipayUnionDetail));
//    }

    /**
     * 删除支付宝和银联交易明细
     */
//    @PreAuthorize("@ss.hasPermi('trade:aliPay:remove')")
//    @Log(title = "支付宝和银联交易明细", businessType = BusinessType.DELETE)
//	@DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable String[] ids)
//    {
//        return toAjax(tradeAlipayUnionDetailService.deleteTradeAlipayUnionDetailByIds(ids));
//    }
}
