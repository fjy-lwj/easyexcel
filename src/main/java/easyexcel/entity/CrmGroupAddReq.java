package easyexcel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.util.List;

/**
 * @author TaoRan
 * @date 2020/8/31
 */
@Getter
@Setter
@ToString
public class CrmGroupAddReq {

    private Long groupId;

    private String groupName;

    /**
     * 1-通过条件筛选 2-导入指定用户 3-数据挖掘
     */
    private Integer dateType;

    private UserSearchParamDTO userCharacter;

    /**
     * 文件编号  "xxxxxx-1"
     */
    private String fileNo;

    /**
     * 文件编号  "xxxxxx-1,xxxxxx-2"
     */
    private List<String> fileNoList;

    /**
     * 分组类型 1-任务类 2-事件触发类
     */
    private String groupType;

    private File file;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * 批次名称
     */
    private String batchName;

    /**
     * 批次对应 用户数量
     */
    private Long userAmount;

    /**
     * 批次特征
     */
    private UserSearchParamDTO.BatchCharacter batchCharacter;

}
