package com.len.demo.utils;

/**
 * @ClassName demoTest
 * @Description demoTest
 * @Author liyong
 * @Date 2020/9/1 13:09
 * @Version 1.0
 */
public class demoTest {

    public static void main(String[] args) {
        String str = "        Columns 36 { int32 DEFECTID,  int32 XREL,  int32 YREL,  int32 XINDEX,  int32 YINDEX,          int32 XSIZE,  int32 YSIZE,  float DEFECTAREA,  int32 DSIZE,  int32 CLASSNUMBER,          int32 TEST,  float CONTRAST,  int32 CHANNELID,  int32 MANSEMCLASS,  int32 AUTOONSEMCLASS,          int32 AUTOOFFSEMCLASS,  int32 AUTOOFFOPTADC,  int32 FACLASS,  int32 INTENSITY,  float KILLPROB,          int32 REGIONID,  int32 EVENTTYPE,  int32 EBRLINE,  ImageList IMAGEINFO,          int32 POLARITY,  float CRITICALAREA,  int32 MANOPTCLASS,  float PHI,  int32 DBCLASS,          int32 DBGROUP,  float DBCRITICALITYINDEX,  float CELLSIZE,  int32 CAREAREAGROUPCODE,  float PCI,          float LINECOMPLEXITY,  float DCIRANGE  }";
        String[] split = str.substring(str.indexOf("{") + 1, str.lastIndexOf("}")).trim().split(",");
        System.out.println("str的长度：" + split.length);
        for (String s : split) {
            System.out.println(s.trim());
            System.out.println(">>");
        }
    }
}
