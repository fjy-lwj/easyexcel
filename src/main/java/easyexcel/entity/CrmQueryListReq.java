package easyexcel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author TaoRan
 * @date 2020/9/1
 */
@Getter
@Setter
@ToString
public class CrmQueryListReq{

    //用户分组
    private Integer groupId;
    private String groupName;
    private Integer dateType;
    private String startTime;
    private String endTime;
    private String updateUser;
    private Integer groupType;

    //任务管理
    private Integer taskId;
    private Integer status;
    private Integer noticeWay;
    private String taskName;

    private Integer compareId;

    //站内信模板
    private Integer templateId;
    private String templateName;
    private Byte templateClassify;
    private Byte templateType;

    //优惠券
    private String code;
    private String name;
    private Integer type;

    //是否分页
    private Boolean flag;

}
