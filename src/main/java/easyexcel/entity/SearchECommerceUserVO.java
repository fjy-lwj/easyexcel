package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 17:36
 *
 * 电商用户
 */
@Data
public class SearchECommerceUserVO {
    /**
     * 访问之前之后 1-前 2-后
     */
    private Integer accessBeforeAfter;

    /**
     * 访问天数
     */
    private Integer accessDay;

    /**
     * 访问平台 1-小象优品 2-新浪分期
     */
    private String accessPlatform;

    /**
     * 访问时间，时间区间范围用,分割
     */
    private String accessTime;

    /**
     * 获客一级渠道，多个,分割
     */
    private String firstChannel;

    /**
     * 获客一级商品类目，多个,分割
     */
    private String firstGoodsCategory;

    /**
     * 访问app 0-否 1-是
     */
    private Integer isAccessApp;

    /**
     * 审核通过 0-否 1-是
     */
    private Integer isApproved;

    /**
     * 是否下电商订单 0-否 1-是
     */
    private Integer isOrder;

    /**
     * 是否属于风控白名单 0-否 1-是
     */
    private Integer isRiskWhiteName;

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
     * 获客二级商品类目，多个,分割
     */
    private String secondGoodsCategory;

    /**
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

    /**
     * 获客三级商品类目，多个,分割
     */
    private String thirdGoodsCategory;

    /**
     * 颜值卡可用额度-高
     */
    private Integer yanzhikaUsableAmountHigh;

    /**
     * 颜值卡可用额度-低
     */
    private Integer yanzhikaUsableAmountLow;

}
