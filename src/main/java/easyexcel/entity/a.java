package easyexcel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fjy
 * @date 2021/1/5 18:04
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class a {
    private String name;
    private Integer status;

    /**
     * actionType : 6
     * afterTime : 1
     * afterTimeUnit :
     * appSource :
     * postActionType :
     * isOrNo :
     * postAppSource : null
     */

    private String actionType;
    private String afterTime;
    private String afterTimeUnit;
    private String appSource;
    private String postActionType;
    private String isOrNo;
    private Object postAppSource;
}
