package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 17:58
 *
 * 注册用户
 */
@Data
public class SearchRegisterUserVO {
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
     * 激活之前之后 1-前 2-后
     */
    private Integer activeBeforeAfter;

    /**
     * 激活天数
     */
    private Integer activeDay;

    /**
     * 激活平台 1-小象优品 2-新浪分期
     */
    private String activePlatform;

    /**
     * 激活时间，时间区间范围用,分割
     */
    private String activeTime;

    /**
     * 授信之前之后 1-前 2-后
     */
    private Integer creditBeforeAfter;

    /**
     * 授信天数
     */
    private Integer creditDay;

    /**
     * 授信时间，时间区间范围用,分割
     */
    private String creditTime;

    /**
     * 获客一级渠道，多个,分割
     */
    private String firstChannel;

    /**
     * 访问app 0-否 1-是
     */
    private Integer isAccessApp;

    /**
     * 是否激活app 0-否 1-是
     */
    private Integer isActive;

    /**
     * 是否授信 0-否 1-是
     */
    private Integer isCredit;

    /**
     * 是否提交订单 0-否 1-是
     */
    private Integer isOrder;

    /**
     * 实名认证 0-否 1-是
     */
    private Integer isRealName;

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
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

}
