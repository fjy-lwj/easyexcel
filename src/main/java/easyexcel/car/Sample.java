package easyexcel.car;

import cn.xsshome.taip.ocr.TAipOcr;


/**
 * 腾讯api 接口
 * 文字识别模块新增手写体识别、车牌识别
 */
public class Sample {
    //设置APPID/APP_KEY
    public static final String APP_ID = "你的 App ID";
    public static final String APP_KEY = "你的 Api Key";

    public static void main(String[] args) throws Exception {
        // 初始化一个TAipOcr
       TAipOcr aipOcr = new TAipOcr(APP_ID,APP_KEY);
        // 调用接口
        //手写体识别 选取本地图片文件识别
        String result = aipOcr.handWritingOcrByImage("./biz.jpg");
        //手写体识别 选取网络图片URL识别
        String result1 = aipOcr.handWritingOcrByUrl("https://yyb.gtimg.com/hd-1-sm.jpg");
        //车牌识别 选取本地图片文件识别
        String result2 = aipOcr.plateOcrByImage("./biz.jpg");
        //车牌识别 选取网络图片URL识别                               
        String result3 = aipOcr.plateOcrByUrl("https://yyb.gtimg.com/plate-1-lg.jpg");

        // 调用接口  腾讯接口
        String result4 = aipOcr.idcardOcr("./idcard.jpg", 0);//身份证正面(图片)识别
        String result5 = aipOcr.idcardOcr("./idcard2.jpg", 1);//身份证反面(国徽)识别
        String result6 = aipOcr.bcOcr("./juli2.jpg");//名片识别
        String result7 = aipOcr.driverlicenseOcr("./driver.jpg",0);//行驶证OCR识别
        String result8 = aipOcr.driverlicenseOcr("./driver2.jpg",1);//驾驶证OCR识别
        String result9 = aipOcr.bizlicenseOcr("./biz.jpg");//营业执照OCR识别
        String result10 = aipOcr.creditcardOcr("./bank2.jpg");//银行卡OCR识别
        String result11 = aipOcr.generalOcr("./biz.jpg");//通用OCR识别
    }
}