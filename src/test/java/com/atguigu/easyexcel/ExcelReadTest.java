package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.atguigu.easyexcel.entity.CrmUserInfoDTO;
import com.atguigu.easyexcel.entity.ExcelStudentData;
import com.atguigu.easyexcel.listener.ExcelStudentDataListener;
import org.junit.Test;

/**
 * @author fjy
 * @since 2020/11/15
 */
public class ExcelReadTest {

    @Test
    public void simpleRead07(){
        ExcelStudentData excelStudentData = new ExcelStudentData();
        excelStudentData.setName("11");
        excelStudentData.setPassword("11");
        String fileName = "C:/me/IO/01-crm-10.xlsx";
        EasyExcel.read(fileName, CrmUserInfoDTO.class, new ExcelStudentDataListener(excelStudentData)).sheet().doRead();
    }

    @Test
    public void simpleRead03(){

        String fileName = "C:/me/IO/01-crm-03.xls";
        EasyExcel.read(fileName, ExcelStudentData.class, new ExcelStudentDataListener()).excelType(ExcelTypeEnum.XLS).sheet().doRead();
    }
}
