package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 18:10
 *
 * 潮鞋用户
 */
@Data
public class SearchShoesUserVO {
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
     * 购买之前之后 1-前 2-后
     */
    private Integer buyBeforeAfter;

    /**
     * 购买天数
     */
    private Integer buyDay;

    /**
     * 购买时间，时间区间范围用,分割
     */
    private String buyTime;

    /**
     * 获客一级渠道，多个,分割
     */
    private String firstChannel;

    /**
     * 访问app 0-否 1-是
     */
    private Integer isAccessApp;

    /**
     * 审核通过 0-否 1-是
     */
    private Integer isApproved;

    /**
     * 是否出价 0-否 1-是
     */
    private Integer isOffer;

    /**
     * 是否属于风控白名单 0-否 1-是
     */
    private Integer isRiskWhiteName;

    /**
     * 是否购买成功 0-否 1-是
     */
    private Integer isSuccessBuy;

    /**
     * 是否出售成功 0-否 1-是
     */
    private Integer isSuccessSold;

    /**
     * 是否发起求购 0-否 1-是
     */
    private Integer isWant;

    /**
     * 出价之前之后 1-前 2-后
     */
    private Integer offerBeforeAfter;

    /**
     * 出价天数
     */
    private Integer offerDay;

    /**
     * 出价时间，时间区间范围用,分割
     */
    private String offerTime;

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
     * 出售之前之后 1-前 2-后
     */
    private Integer soldBeforeAfter;

    /**
     * 出售天数
     */
    private Integer soldDay;

    /**
     * 出售时间，时间区间范围用,分割
     */
    private String soldTime;

    /**
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

    /**
     * 求购之前之后 1-前 2-后
     */
    private Integer wantBeforeAfter;

    /**
     * 求购天数
     */
    private Integer wantDay;

    /**
     * 求购时间，时间区间范围用,分割
     */
    private String wantTime;

    /**
     * 颜值卡可用额度-高
     */
    private Integer yanzhikaUsableAmountHigh;

    /**
     * 颜值卡可用额度-低
     */
    private Integer yanzhikaUsableAmountLow;

}
