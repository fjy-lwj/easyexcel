package easyexcel.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author fjy
 * @date 2021/1/26 18:45
 */

@Data
@Builder
public class CrmBIBatchListDTO {

    /**
     * 批次号
     */
    private Long batchId;

    /**
     * 批次名称
     */
    private String labelName;

    /**
     * 用户数量
     */
    private Long count;

    /**
     * 生成时间
     */
    private Date finishTime;
}
