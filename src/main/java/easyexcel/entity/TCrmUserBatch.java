package easyexcel.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TCrmUserBatch implements Serializable {
    /**
     * 
     * id
    */
    private Integer id;

    /**
     * 用户分组id
     * group_id
    */
    private Integer groupId;

    /**
     * 批次号
     * batch_id
    */
    private Long batchId;

    /**
     * 批次名称
     * batch_name
    */
    private String batchName;

    /**
     * 用户数量
     * user_amount
    */
    private Long userAmount;

    /**
     * 生成时间
     * finish_time
    */
    private Date finishTime;

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

    private static final long serialVersionUID = 1L;
}