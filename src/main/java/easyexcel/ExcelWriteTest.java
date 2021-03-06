package easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import easyexcel.entity.*;
import easyexcel.listener.util.DateUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author fjy
 * @since 2020/11/15
 */
public class ExcelWriteTest {

    @Test
    public void simpleWrite(){

        String fileName = "C:/me/IO/01-crm-21.xlsx";
        EasyExcel.write(fileName, CrmUserInfoDTO.class)
//                .excelType(ExcelTypeEnum.XLS)
                .sheet("用户列表")
                .doWrite(data());
    }

    //创建列表
    private List<CrmUserInfoDTO> data(){
        List<CrmUserInfoDTO> list = new ArrayList<CrmUserInfoDTO>();

        for (int i = 0; i < 10; i++) {
            CrmUserInfoDTO data = new CrmUserInfoDTO();
            data.setPhone("手机号" + i);
            data.setUserId(i);
            data.setAge(i);

            list.add(data);
        }

        return list;
    }
//
    @Test
    public void test3(){
        String videoId = "bb优品";
        String a = "【小象";
        int length = videoId.length();
        int length1 = a.length();
        int ceil = (int)Math.ceil((double)length / length1);

        double templateCost = Math.ceil((double) a.length() / 100) * 0.15;
        System.out.println("templateCost = " + templateCost);
        int i1 =  ceil* 20;
        System.out.println("i1 = " + i1);
        System.out.println("ceil = " + ceil);

        System.out.println("length1 = " + length1);

        System.out.println("length = " + length);
    }

    @Test
    public void test4() throws Exception {
        File file = new File("C:\\me\\IO\\01-crm-12.xlsx");
        String fileName = file.getName();
        Workbook workbook = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        // excel类型
        if (fileName.endsWith(".xls")) {
            workbook = new HSSFWorkbook(fileInputStream);
        } else if (fileName.endsWith(".xlsx")) {
            workbook = new XSSFWorkbook(fileInputStream);
        }
        Sheet sheetAt = workbook.getSheetAt(0);
        String sheetName = sheetAt.getSheetName();
        System.out.println("sheetAt = " + sheetName);
        //Sheet sheet1 = workbook.getSheet("Sheet1"); // excel文件的工作簿的名称
        Sheet sheet1 = workbook.getSheet(sheetName); // excel文件的工作簿的名称
        //Sheet sheet2 = workbook.getSheet("sheet2"); // excel文件的工作簿的名称
        // 不作处理时获取的行数
        int lastRowNum1 = sheet1.getLastRowNum();
        System.out.println("lastRowNum1 = " + lastRowNum1);
    }

    @Test
    public void test5() {

        String EXPORT = "推广数据统计导出 {导出时间}.xls";
        String DETAIL_EXPORT = "推广数据统计详情导出 {任务编号} {导出时间}.xls";

        String export = EXPORT.replace("{导出时间}", DateUtils.dateToStr(new Date()));
        String detailExport = DETAIL_EXPORT.replace("{任务编号}","1120").replace("{导出时间}", DateUtils.dateToStr(new Date()));


        Integer[] aaa = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        //将list集合转为string集合
        List<Integer> bannerIds = Arrays.asList(aaa);
        List<String> transform = Lists.transform(bannerIds, String::valueOf);
        String bannerId = transform.stream().collect(Collectors.joining(","));
        System.out.println("bannerId = " + bannerId);

        //从一组数字中，找出最小的那个数字
        int min = IntStream.of(nums).max().getAsInt();
        System.out.println(min);

        System.out.println("export = " + export);
        System.out.println("detailExport = " + detailExport);


    }

    @Test
    public void test6() {
        int num = 1000;
        int count = 6211;
        int i = 99999999;
        int y = 99;
        int index = 1 * 144 / 100;

        System.out.println("index = " + index);
        /******按指定格式格式化******/
        String format = new DecimalFormat("#,###").format(i);
        String format1 = new DecimalFormat("#,###").format(y);
        System.out.println("format = " + format);
        System.out.println("format1 = " + format1);

        List<String> list= Lists.newArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        /**
         * 用->字符串将list内容连接
         * 结果：one->two->three->four，不用做二次处理
         */
        String value= Joiner.on("->").join(list);
        System.out.println(value);

        BigDecimal bg = new BigDecimal("1E11");
        System.out.println(bg.toEngineeringString());
        System.out.println(bg.toPlainString());
        System.out.println(bg.toString());
    }



    @Test
    public void test07() {
//        CrmUserInfoDTO crmUserInfoDTO = new CrmUserInfoDTO();
//        crmUserInfoDTO.setUserId(1);
//
//        ExcelStudentData excelStudentData = new ExcelStudentData();
//        excelStudentData.setPassword(crmUserInfoDTO.getBatchNo());

        Integer age = idCardToAge("321281199412164057");
        System.out.println("age = " + age);
        List<Long> jobIdList = new ArrayList<>();
        System.out.println("jobId = " + jobIdList);
        if (CollectionUtils.isEmpty(jobIdList)) {
            jobIdList.add(0l);
            System.out.println("jobIdList = " + jobIdList.size());
        }
        if (jobIdList == null) {
            System.out.println("jobIdList = " + jobIdList);
        }
        if (jobIdList != null || jobIdList.size() > 0) {
            jobIdList.forEach(System.out::println);
        }

        Date date1 = DateUtils.dateCalc(new Date(), -1, DateUtils.DAY);
        System.out.println("date1 = " + date1);
        Date date = new Date();
        System.out.println("date = " + date);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date1);
        c1.set(11, 23);
        c1.set(12, 59);
        c1.set(13, 59);
        c1.set(14, 999);
        System.out.println("c1.getTime() = " + c1.getTime());
        System.out.println("c1 = " + c1);



        Calendar c2 = Calendar.getInstance();
        c2.setTime(c1.getTime());
        c2.add(Calendar.MONTH , -1);
        Date date2 = clearHourMinuteAndSecond(c2.getTime());
        System.out.println("c2 = " + c2);
        System.out.println("clearHourMinuteAndSecond(c1.getTime()) = " + date2);

        String s1 = DateUtils.dateToStr(date2, DateUtils.FORMATSTR);
        System.out.println("s1 = " + s1);
        String s2 = DateUtils.dateToStr(c1.getTime(), DateUtils.FORMATSTR);
        System.out.println("s2 = " + s2);


    }

    @Test
    public void test08() {
        String DETAIL_EXPORT = "推广数据统计详情导出 {任务编号} {导出时间}.xls";
        String detailExport = DETAIL_EXPORT.replace("{任务编号}","1").replace("{导出时间}", DateUtils.dateToStr(new Date()));
        System.out.println("detailExport = " + detailExport);

        ExcelStudentData ex = ExcelStudentData.builder().birthday(new Date()).name("小白").build();
        String string = JSON.toJSONString(ex);
        System.out.println("string = " + string);
        HashMap<String, Object> stringObjectHashMap = JSON.parseObject(string, new TypeReference<HashMap<String, Object>>() {
        });
        System.out.println("stringObjectHashMap = " + stringObjectHashMap);

        //language=JSON
        String a = "{\"aa\":\"bb\"}";

    }

    @Test
    public void test09() {
        ExcelStudentData excelStudentData = new ExcelStudentData();
        excelStudentData.setPassword("");
        excelStudentData.setName("");
        excelStudentData.setBirthday(null);
        String string = JSON.toJSONString(excelStudentData);
        System.out.println("equals = " + string);

        CrmUserInfoDTO crmUserInfoDTO = new CrmUserInfoDTO();
        crmUserInfoDTO.setAge(null);
        crmUserInfoDTO.setPhone("");
        System.out.println("1   " + JSON.toJSONString(crmUserInfoDTO));
        PropertyFilter filter = new PropertyFilter() {

            @Override
            public boolean apply(Object object, String name, Object value) {
                // TODO Auto-generated method stub
                if(value ==null) {
                    return false;
                }
                if(value instanceof String && ((String)value).isEmpty()) {
                    return false;
                }

                return true;
            }
        };
        //
        System.out.println("2   " + JSON.toJSONString(crmUserInfoDTO,filter));
    }

    @Test
    public void test10() {
        List<String> List = new ArrayList<>();
        List.add("母婴");
        List.add("活动用品");
        List.add("服饰鞋帽");
        List.add("家居日用");
        List.add("数码");
        List.add("运动户外");
        System.out.println("List = " + List);
        List<String> result = new ArrayList<>();
        for (String s : List) {
            System.out.println("s = " + s);
            result.add(s);
        }
        System.out.println("result = " + result);

        String s = "{\"name\":\"非投放\",\"value\":\"非投放\"}";
        CrmGroupChannelDTO crmGroupChannelDTO = JSONObject.parseObject(s, CrmGroupChannelDTO.class);
        System.out.println("crmGroupChannelDTO = " + crmGroupChannelDTO);

        int index = 50000 * 100 / 100;
        System.out.println("index = " + index);

    }

    @Test
    public void test11() {
        String json = "{\"groupName\":\"33\",\"dateType\":4,\"batchId\":101,\"batchCharacter\":{\"type\":\"潮鞋用户\",\"way\":\"普通挖掘\"},\"userAmount\":10000}";
        CrmGroupAddReq crmGroupAddReq = JSONObject.parseObject(json, CrmGroupAddReq.class);
        System.out.println("crmGroupAddReq = " + crmGroupAddReq);

        LocalDateTime localDateTime = LocalDateTime.now();

        Date date = Date.from( localDateTime.atZone( ZoneId.systemDefault()).toInstant());

        System.out.println(date);
    }

    @Test
    public void test12() {
        List<CrmBIBatchListDTO> crmBIBatchListDTOS = new ArrayList<CrmBIBatchListDTO>();
        CrmBIBatchListDTO c1 = CrmBIBatchListDTO.builder().batchId(1L).labelName("名称1").count(100L).finishTime(new Date()).build();
        CrmBIBatchListDTO c2 = CrmBIBatchListDTO.builder().batchId(2L).labelName("名称2").count(100L).finishTime(new Date()).build();
        CrmBIBatchListDTO c3 = CrmBIBatchListDTO.builder().batchId(3L).labelName("名称3").count(100L).finishTime(new Date()).build();
        crmBIBatchListDTOS.add(c1);
        crmBIBatchListDTOS.add(c2);
        crmBIBatchListDTOS.add(c3);
        System.out.println("crmBIBatchListDTOS = " + crmBIBatchListDTOS);
        String string = JSON.toJSONString(crmBIBatchListDTOS);
        System.out.println("string = " + string);

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        String add = JSON.toJSONString(strings);
        System.out.println("add = " + add);
    }

    @Test
    public void test13() {

//        String string = JSON.toJSONString(a.builder().name("").status(3).build());
//        System.out.println("string = " + string);
//        b b = JSON.parseObject(string, b.class);
//        System.out.println("b = " + b);
//
        String shareId = getShareId();
        System.out.println("shareId = " + shareId);
//
//        String randomPassword = getRandomPassword();
//        System.out.println("randomPassword = " + randomPassword);

        List<Integer> userIdList = JSONObject.parseArray(null, Integer.class);
        System.out.println("userIdList = " + userIdList);

    }



    public static Date clearHourMinuteAndSecond(Date date){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        c1.set(Calendar.HOUR_OF_DAY , 0);
        c1.set(Calendar.MINUTE , 0);
        c1.set(Calendar.SECOND , 0);
        c1.set(Calendar.MILLISECOND , 0);
        return c1.getTime();
    }

    public static Integer idCardToAge(String idcard) {
        Integer selectYear = Integer.valueOf(idcard.substring(6, 10));         //出生的年份
        Integer selectMonth = Integer.valueOf(idcard.substring(10, 12));       //出生的月份
        Integer selectDay = Integer.valueOf(idcard.substring(12, 14));         //出生的日期
        Calendar cal = Calendar.getInstance();
        Integer yearMinus = cal.get(Calendar.YEAR) - selectYear;
        Integer monthMinus = cal.get(Calendar.MONTH) + 1 - selectMonth;
        Integer dayMinus = cal.get(Calendar.DATE) - selectDay;

        System.out.println("YEAR = " + cal.get(Calendar.YEAR));
        System.out.println("MONTH = " + cal.get(Calendar.MONTH));
        System.out.println("DATE = " + cal.get(Calendar.DATE));
        System.out.println("==============");
        System.out.println("yearMinus = " + yearMinus);
        System.out.println("monthMinus = " + monthMinus);
        System.out.println("dayMinus = " + dayMinus);


        Integer age = yearMinus;
        if (yearMinus < 0) {
            age = 0;
        } else if (yearMinus == 0) {
            if (monthMinus < 0) {
                age = 0;
            } else if (monthMinus == 0) {
                if (dayMinus < 0) {
                    age = 0;
                } else if (dayMinus >= 0) {
                    age = 1;
                }
            } else if (monthMinus > 0) {
                age = 1;
            }
        } else if (yearMinus > 0) {
            if (monthMinus == 0) {
                if (dayMinus >= 0) {
                    age = age + 1;
                }
            } else if (monthMinus > 0) {
                age = age + 1;
            }
        }
        return age;
    }

    public static int getAgeByBirth(Date birthDay) throws ParseException {
        int age = 0;
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;//当前日期在生日之前，年龄减一
                }
            } else {
                age--;//当前月份在生日之前，年龄减一
            }
        }
        return age;
    }

    public static String getShareId(){
        String uid= UUID.randomUUID().toString();
        int max=1000,min=1;
        long randomNum = System.currentTimeMillis();
        int ran = (int) (randomNum%(max-min)+min);
        System.out.println("ran = " + ran);
        return ran+uid.replace("-", "");
    }

    /**
     * 随机密码长度
     */
    private static final int PASSWORD_LENGTH = 10;

    /**
     * 获取验证过的随机密码
     * @return
     */
    public static String getRandomPassword() {
        char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*.?".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int x = 0; x < PASSWORD_LENGTH; ++x) {
            sb.append(charr[r.nextInt(charr.length)]);
        }
        return sb.toString();
    }


    /**
     * @param url servlet的地址
     * @param params 要传递的参数
     * @param files 要上传的文件
     * @return true if upload success else false
     * @throws ClientProtocolException
     * @throws IOException
     */
    private boolean uploadFiles(String url,Map<String, String>params,ArrayList<File> files) throws ClientProtocolException, IOException {
        HttpClient client=new DefaultHttpClient();// 开启一个客户端 HTTP 请求
        HttpPost post = new HttpPost(url);//创建 HTTP POST 请求
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setCharset(Charset.forName("uft-8"));//设置请求的编码格式
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);//设置浏览器兼容模式
        int count=0;
        for (File file:files) {
            builder.addBinaryBody("file"+count, file);
            count++;
        }
        builder.addTextBody("method", params.get("method"));//设置请求参数
        builder.addTextBody("fileTypes", params.get("fileTypes"));//设置请求参数
        HttpEntity entity = builder.build();// 生成 HTTP POST 实体
        post.setEntity(entity);//设置请求参数
        HttpResponse response = client.execute(post);// 发起请求 并返回请求的响应
        if (response.getStatusLine().getStatusCode()==200) {
            return true;
        }
        return false;
    }

}
