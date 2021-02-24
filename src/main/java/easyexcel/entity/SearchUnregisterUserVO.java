package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 18:20
 *
 * 未注册用户
 */
@Data
public class SearchUnregisterUserVO {
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
     * 获客二级渠道，多个,分割
     */
    private String secondChannel;

    /**
     * 获客三级渠道，多个,分割
     */
    private String thirdChannel;

}
