package com.atguigu.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

/**
 * @author TaoRan
 * @date 2020/9/4
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrmUserInfoDTO {

    @ExcelProperty(value = "手机号")
    private String phone;

    @ExcelProperty(value = "用户id")
    private Integer userId;

    @ExcelIgnore
    private Integer creditAmount;
    @ExcelIgnore
    private String loginName;
    @ExcelIgnore
    private String realNameStatus;
    @ExcelIgnore
    private String registerTime;
    @ExcelIgnore
    private String registerType;
    @ExcelIgnore
    private Integer usableAmount;
    @ExcelIgnore
    private Integer usedCreditAmount;
    @ExcelIgnore
    private String batchNo;
    @ExcelIgnore
    private Integer age;
    @ExcelIgnore
    private String labelValue;
    @ExcelIgnore
    private String papersCode;
    @ExcelIgnore
    private String sex;
    @ExcelIgnore
    private String userRealName;
    @ExcelIgnore
    private String deviceNo;
}
