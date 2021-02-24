package easyexcel.entity;

import lombok.Data;

/**
 * @author fjy
 * @date 2020/11/23 17:36
 *
 * 事件触发用户
 */
@Data
public class SearchEventTriggerUserVO {

    /**
     * 前置行为
     */
   private Byte actionType;

    /**
     * 时间
     */
   private Integer afterTime;

    /**
     * 时间单位 1-天 2-分钟
     */
   private Integer afterTimeUnit;

    /**
     * app来源 1-小象 2-新浪分期 3-H5
     */
   private Integer appSource;

    /**
     * 后置行为
     */
   private Byte postActionType;

    /**
     * 1-是 2-否
     */
    private Integer isOrNo;

    /**
     * 后置行为app来源 1-小象 2-新浪分期 3-H5
     */
    private Integer postAppSource;
}
