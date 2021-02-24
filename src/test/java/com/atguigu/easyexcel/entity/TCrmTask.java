package com.atguigu.easyexcel.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TCrmTask implements Serializable {
    /**
     * 
     * id
    */
    private Integer id;

    /**
     * 任务名称
     * task_name
    */
    private String taskName;

    /**
     * 用户分组id
     * group_id
    */
    private Integer groupId;

    /**
     * 
     * start_time
    */
    private Date startTime;

    /**
     * 
     * end_time
    */
    private Date endTime;

    /**
     * 任务状态，0-待审核、1-待执行、2-执行中、3-执行完毕、4-执行暂停、5-已取消、6-审核拒绝
     * status
    */
    private Byte status;

    /**
     * 触发机制 默认0-定时，1-事件触发
     * task_trigger
    */
    private Byte taskTrigger;

    /**
     * 
     * create_time
    */
    private Date createTime;

    /**
     * 
     * update_time
    */
    private Date updateTime;

    /**
     * 上次执行时间
     * last_execute_time
    */
    private Date lastExecuteTime;

    /**
     * 创建人
     * update_user
    */
    private String updateUser;

    /**
     * 审核时间
     * audit_time
    */
    private Date auditTime;

    /**
     * 审核人
     * audit_user
    */
    private String auditUser;

    private static final long serialVersionUID = 1L;
}