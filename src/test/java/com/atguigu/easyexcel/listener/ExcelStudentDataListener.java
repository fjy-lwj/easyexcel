package com.atguigu.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.atguigu.easyexcel.entity.CrmUserInfoDTO;
import com.atguigu.easyexcel.entity.ExcelStudentData;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;

/**
 * @author fjy
 * @since 2020/11/15
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ExcelStudentDataListener extends AnalysisEventListener<CrmUserInfoDTO> {

//    private StudentDao studentDao;

    //学员数据列表
    //private List<ExcelStudentData> list = new ArrayList<ExcelStudentData>();
    //内存中列表的最大长度
    private static final int BATCH_COUNT = 5;
    ExcelStudentData excelStudentData;


    /**
     * 监听每一行数据的读取
     * @param data
     * @param context
     */
    @Override
    public void invoke(CrmUserInfoDTO data, AnalysisContext context) {
        System.out.println(data);
        System.out.println("excelStudentData = " + excelStudentData);
        //方案一：数据插入；访问dao层将数据插入到数据库
        //方案二：先将数据存入list集合，然后做批量插入
//        list.add(data);
//        //达到BATCH_COUNT所指定的值，需要去存储一次数据库，防止数据过多导致的内存溢出，容易OOM
//        if(list.size() >= BATCH_COUNT){
//            log.info("数据存入数据库，清理内存");
//            //TODO 数据插入；访问dao层将数据插入到数据库
//            //清理内存
//            list.clear();
//        }
    }

    /**
     * 所有数据行被解析和读取完成后被调用
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        //访问dao层批量插入数据
//        studentDao.batchSave(list);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        log.info("解析到一条头数据:{}", JSON.toJSONString(headMap));
        System.out.println("headMap = " + headMap.size());
        Set<Map.Entry<Integer, String>> entries = headMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("===" + entry.getKey()+"===="+entry.getValue());
        }
    }
}
