package easyexcel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author helen
 * @since 2020/7/22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExcelStudentData {

    @ExcelProperty(value = "姓名", index = 0)
    private String name;

    @ExcelProperty(value = "生日", index = 1)
    @DateTimeFormat("yyyy年MM月dd日")
    private Date birthday;

    @ExcelProperty(value = "薪资", index = 2)
    @NumberFormat("#.#")
    private Double salary;

//    @ExcelProperty(value = "密码", index = 5)
    @ExcelIgnore
    private String password;
}
