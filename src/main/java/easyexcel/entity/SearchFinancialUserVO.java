package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 17:38
 *
 * 金融用户
 */
@Data
public class SearchFinancialUserVO {
    /**
     * 后台取消订单之前之后 1-前 2-后
     */
    private Integer cancelOrderBeforeAfter;

    /**
     * 后台取消订单天数
     */
    private Integer cancelOrderDay;

    /**
     * 后台取消订单时间，时间区间范围用,分割
     */
    private String cancelOrderTime;

    /**
     * 获客一级渠道，多个,分割
     */
    private String firstChannel;

    /**
     * 审核通过 0-否 1-是
     */
    private Integer isApproved;

    /**
     * 是否后台取消订单 0-否 1-是
     */
    private Integer isCancelOrder;

    /**
     * 后台取消后是否再次分期订单 0-否 1-是
     */
    private Integer isCancelOrderAfterOrder;

    /**
     * 是否到期未还款 0-否 1-是
     */
    private Integer isExpireRepayment;

    /**
     * 是否为优质老客 0-否 1-是
     */
    private Integer isGoodOldUser;

    /**
     * 是否下分期订单 0-否 1-是
     */
    private Integer isOrder;

    /**
     * 是否属于风控白名单 0-否 1-是
     */
    private Integer isRiskWhiteName;

    /**
     * 是否结清 0-否 1-是
     */
    private Integer isSettlement;

    /**
     * 是否在结清日后下单支付 0-否 1-是
     */
    private Integer isSettlementOrder;

    /**
     * 最大逾期范围 3,7,30,31-自定义
     */
    private String maxOverdue;

    /**
     * 最大逾期天数（预期范围自定义）
     */
    private Integer maxOverdueDay;

    /**
     * 下单之前之后 1-前 2-后
     */
    private Integer orderBeforeAfter;

    /**
     * 下单天数
     */
    private Integer orderDay;

    /**
     * 下单平台 1-小象优品 2-新浪分期
     */
    private String orderPlatform;

    /**
     * 下单时间，时间区间范围用,分割
     */
    private String orderTime;

    /**
     * 钱包可用额度-高
     */
    private Integer qianbaoUsableAmountHigh;

    /**
     * 钱包可用额度-低
     */
    private Integer qianbaoUsableAmountLow;

    /**
     * 情侣卡可用额度-高
     */
    private Integer qinglvkaUsableAmountHigh;

    /**
     * 情侣卡可用额度-低
     */
    private Integer qinglvkaUsableAmountLow;

    /**
     * 浪花黑卡可用额度-低
     */
    private Integer qpmUsableAmountLow;

    /**
     * 浪花黑卡可用额度-高
     */
    private Integer qpmbaoUsableAmountHigh;

    /**
     * 注册之前之后 1-前 2-后
     */
    private Integer registerBeforeAfter;

    /**
     * 注册天数
     */
    private Integer registerDay;

    /**
     * 注册平台 1-小象优品 2-新浪分期 3-H5
     */
    private String registerPlatform;

    /**
     * 注册时间，时间区间范围用,分割
     */
    private String registerTime;

    /**
     * 获客二级渠道，多个,分割
     */
    private String secondChannel;

    /**
     * 结清之前之后 1-前 2-后
     */
    private Integer settlementBeforeAfter;

    /**
     * 结清天数
     */
    private Integer settlementDay;

    /**
     * 结清时间，时间区间范围用,分割
     */
    private String settlementTime;

    /**
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

    /**
     * 到期未还款天数
     */
    private Integer unRepaymentDay;

    /**
     * 颜值卡可用额度-高
     */
    private Integer yanzhikaUsableAmountHigh;

    /**
     * 颜值卡可用额度-低
     */
    private Integer yanzhikaUsableAmountLow;

}
