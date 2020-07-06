package com.example.tlq.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.*;

//import static java.lang.System.currentTimeMillis;


public class xml_util {

    @Test
    public void test(){
        Long start= System.currentTimeMillis();
        createxml_1000();
        System.out.println("运行时间："+(System.currentTimeMillis()-start));
    }

    /**生成xml的方法**/
    public static void createxml_1000(){
        // 1.创建document对象
        Document document= DocumentHelper.createDocument();

        Element rss=document.addElement("FCC");

        rss.addAttribute("version","2.0");

        Element channel=rss.addElement("channel");
        Element title=channel.addElement("title");
        title.setText("国内最新新闻");

        OutputFormat format=OutputFormat.createPrettyPrint();

        format.setEncoding("UTF-8");


        File file=new File("rss.xml");
        try {
            XMLWriter writer=new XMLWriter(new FileOutputStream(file),format);
            writer.setEscapeText(false);//设置是否转义，默认使用转义字符
            writer.write(document);
            writer.close();
            System.out.println("生成1000.xml成功!");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("生成rss.xml失败");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
