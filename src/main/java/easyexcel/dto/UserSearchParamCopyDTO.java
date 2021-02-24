package easyexcel.dto;

import easyexcel.entity.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// 防止有遗漏

/**
 * @author TaoRan
 * @date 2020/8/26
 */
@Getter
@Setter
@ToString
public class UserSearchParamCopyDTO {

    /**
     * 分组类型 1-任务类 2-事件触发类
     */
    private String groupType;

    /**
     * 任务用户类型 1-电商用户 2-金融用户 3-潮鞋用户 4-注册用户 5-未注册用户
     */
    private String taskUserType;

    /**
     * 事件触发
     */
    private SearchEventTriggerUserVO searchEventTriggerUserVO;

    /**
     * 电商用户
     */
    private SearchECommerceUserVO searchECommerceUserVO;

    /**
     * 金融用户
     */
    private SearchFinancialUserVO searchFinancialUserVO;

    /**
     * 注册用户
     */
    private SearchRegisterUserVO searchRegisterUserVO;

    /**
     * 未注册用户
     */
    private SearchUnregisterUserVO searchUnregisterUserVO;

    /**
     * 潮鞋用户
     */
    private SearchShoesUserVO searchShoesUserVO;

    /**
     * 查询时间
     */
    private String queryTime;

    /**
     * 用户数量
     */
    private Long userAmount;

    /**
     * 是否注册 0-否 1-是
     */
    private Integer isRegister;

    /**
     * 注册时间，时间区间范围用,分割
     */
    private String registerTime;

    /**
     * 注册天数
     */
    private Integer registerDay;

    /**
     * 注册之前之后 1-前 2-后
     */
    private Integer registerBeforeAfter;

    private Integer registerTimeType;

    /**
     * 注册平台 1-小象优品 2-新浪分期 3-H5
     */
    private String registerPlatform;

    /**
     * 是否激活app 0-否 1-是
     */
    private Integer isActive;

    /**
     * 激活时间，时间区间范围用,分割
     */
    private String activeTime;

    /**
     * 激活天数
     */
    private Integer activeDay;

    /**
     * 激活之前之后 1-前 2-后
     */
    private Integer activeBeforeAfter;

    /**
     * 激活平台 1-小象优品 2-新浪分期
     */
    private String activePlatform;

    private Integer activeTimeType;

    /**
     * 访问app 0-否 1-是
     */
    private Integer isAccessApp;

    /**
     * 访问时间，时间区间范围用,分割
     */
    private String accessTime;

    /**
     * 访问天数
     */
    private Integer accessDay;

    /**
     * 访问之前之后 1-前 2-后
     */
    private Integer accessBeforeAfter;

    private Integer accessTimeType;

    /**
     * 访问平台 1-小象优品 2-新浪分期
     */
    private String accessPlatform;

    /**
     * 实名认证 0-否 1-是
     */
    private Integer isRealName;

    /**
     * 是否授信 0-否 1-是
     */
    private Integer isCredit;

    /**
     * 授信时间，时间区间范围用,分割
     */
    private String creditTime;

    /**
     * 授信天数
     */
    private Integer creditDay;

    /**
     * 授信之前之后 1-前 2-后
     */
    private Integer creditBeforeAfter;

    private Integer creditTimeType;

    /**
     * 分期订单 0-否 1-是
     */
    private Integer isOrderPay;

    /**
     * 下单时间，时间区间范围用,分割
     */
    private String orderTime;

    /**
     * 下单天数
     */
    private Integer orderDay;

    /**
     * 下单之前之后 1-前 2-后
     */
    private Integer orderBeforeAfter;

    private Integer orderTimeType;

    /**
     * 审核通过 0-否 1-是
     */
    private Integer isApproved;

    /**
     * 是否到期未还款 0-否 1-是
     */
    private Integer isExpireRepayment;

    /**
     * 未还款天数
     */
    private Integer unRepaymentDay;

    /**
     * 是否结清 0-否 1-是
     */
    private Integer isSettlement;

    /**
     * 结清时间，时间区间范围用,分割
     */
    private String settlementTime;

    /**
     * 结清天数
     */
    private Integer settlementDay;

    /**
     * 结清之前之后 1-前 2-后
     */
    private Integer settlementBeforeAfter;

    private Integer settlementTimeType;

    /**
     * 最大逾期范围 3,7,30,31-自定义
     */
    private String maxOverdue;

    /**
     * 最大逾期天数（预期范围自定义）
     */
    private Integer maxOverdueDay;

    /**
     * 是否在结清日后下单支付 0-否 1-是
     */
    private Integer isSettlementOrder;

    /**
     * 获客一级渠道，多个,分割
     */
    private String firstChannel;

    /**
     * 获客二级渠道，多个,分割
     */
    private String secondChannel;

    /**
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

    /**
     * 订单类型，多个,分割
     */
    private String orderType;

    /**
     * 下单渠道，多个,分割
     */
    private String platform;

    /**
     * 是否属于风控白名单 0-否 1-是
     */
    private Integer isRiskWhiteName;

    /**
     * 注册平台 1-小象优品 2-新浪分期 3-H5
     */
    private String registerSourcePlatform;

    /**
     * 钱包可用额度-低
     */
    private Integer qianbaoUsableAmountLow;

    /**
     * 钱包可用额度-高
     */
    private Integer qianbaoUsableAmountHigh;

    /**
     * 颜值卡可用额度-低
     */
    private Integer yanzhikaUsableAmountLow;

    /**
     * 颜值卡可用额度-高
     */
    private Integer yanzhikaUsableAmountHigh;

    /**
     * 情侣卡可用额度-低
     */
    private Integer qinglvkaUsableAmountLow;

    /**
     * 情侣卡可用额度-高
     */
    private Integer qinglvkaUsableAmountHigh;

    /**
     * 浪花黑卡可用额度-低
     */
    private Integer qpmUsableAmountLow;

    /**
     * 浪花黑卡可用额度-高
     */
    private Integer qpmbaoUsableAmountHigh;

    /**
     * 是否后台取消订单 0-否 1-是
     */
    private Integer isCancelOrder;

    /**
     * 后台取消订单时间，时间区间范围用,分割
     */
    private String cancelOrderTime;

    /**
     * 后台取消订单天数
     */
    private Integer cancelOrderDay;

    /**
     * 后台取消订单之前之后 1-前 2-后
     */
    private Integer cancelOrderBeforeAfter;

    private Integer cancelOrderTimeType;

    /**
     * 后台取消后是否再次分期订单 0-否 1-是
     */
    private Integer isCancelOrderAfterOrder;

    /**
     * 还款金额-低
     */
    private Integer repaymentAmountLow;

    /**
     * 还款金额-高
     */
    private Integer repaymentAmountHigh;

    /**
     * 还款时间，时间区间范围用,分割
     */
    private String repaymentTime;

    /**
     * 还款时间天数
     */
    private Integer repaymentDay;

    /**
     * 还款时间之前之后 1-前 2-后
     */
    private Integer repaymentBeforeAfter;

    private Integer repaymentTimeType;

    /** ===============================数据挖掘================================*/

    /**
     * 批次号
     */
    private Integer batchId;

    /**
     * 批次名称
     */
    private String batchName;

    private BatchCharacter batchCharacter;

    @Getter
    @Setter
    @ToString
    static class BatchCharacter {
        private String type;
        private String way;
    }

    /** ===============================导入================================*/

    private String fileName;

}
