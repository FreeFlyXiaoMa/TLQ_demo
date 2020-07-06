package com.example.tlq.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.lang.annotation.ElementType;
import java.util.EventListener;

public class xml_utils {
    public xml_utils(){

    }

    public static void xml_1000(){
        /**
         * 投诉工单上报业务报文
         * 请求报文（1000）数据项
         */
        Document document= DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
        Element head=fcc.addElement("HEAD");
            Element ver=head.addElement("VER");
            ver.setText("1.0");
            Element app=head.addElement("APP");
            app.setText("冀时办");
            Element bcode=head.addElement("BCode");
            Element txid=head.addElement("TXID");
            Element msgid=head.addElement("MsgID");
            Element workdate=head.addElement("WorkDate");
            Element LEI=head.addElement("LEI");
        Element msg=fcc.addElement("MSG");
            Element countryCode=msg.addElement("CountryCode");
            Element provinceCode=msg.addElement("ProvinceCode");
            Element cityCode=msg.addElement("CityCode");
            Element areaCode=msg.addElement("AreaCode");
            Element birthDay=msg.addElement("Birthday");
            Element bankCode=msg.addElement("BankCode");
            Element complaintCode=msg.addElement("ComplaintDate");
            Element compalintChannel=msg.addElement("ComplaintChannel");
            Element complaintType=msg.addElement("ComplaintType");
            Element complaintReason=msg.addElement("ComplaintReason");
            Element complaintAccount=msg.addElement("ComplaintAccount");
            Element complaintNumber=msg.addElement("ComplaintNumber");
            Element complaintReq=msg.addElement("ComplaintReq");
            Element doneDate=msg.addElement("DoneDate");
            Element reversed1=msg.addElement("Reversed1");
            Element reversed2=msg.addElement("Reversed2");
            Element reversed3=msg.addElement("Reversed3");
            Element reversed4=msg.addElement("Reversed4");
            Element reversed5=msg.addElement("Reversed5");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1000.xml");

        XMLWriter xmlWriter= null;
        try {
            xmlWriter = new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);//是否转义
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xml_1010(){
        /**
         * 投诉工单办结业务报文
         * DoneDate字段为空，表示工单正在处理中；DoneNote不为空且数据有效，表示本宫但上报时已经办结，不需要额外处理
         * 请求报文（1010）数据项
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
            Element head=fcc.addElement("HEAD");
                Element ver=head.addElement("VER");
                Element app=head.addElement("APP");
                Element bCode=head.addElement("BCode");
                Element txid=head.addElement("TXID");
                Element msgId=head.addElement("MsgID");
                Element workDate=head.addElement("WorkDate");
                Element lei=head.addElement("LET");
            Element msg=fcc.addElement("MSG");
                Element id=msg.addElement("ID");
                Element doneDate=msg.addElement("DoneDate");
                Element reserved1=msg.addElement("Reserved1");
                Element reserved2=msg.addElement("Reserved2");
                Element reserved3=msg.addElement("Reserved3");
                Element reserved4=msg.addElement("Reserved4");
                Element reserved5=msg.addElement("Reserved5");
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1010.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void xml_1100(){
        /**
         * 国家/地区基础信息同步请求报文
         * 1. 当商业银行系统未同步国家/地区基础数据时，上传投诉工单1000消息，会收到0031错误信息
         * 2. 商业银行系统发送1100消息申请同步国家/地区基础数据，收到的1101消息会有相关变动数据描述
         * 3.商业银行系统发送1102消息表示同步基础数据成功，会收到1103消息回复
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
            Element head=fcc.addElement("HEAD");
                Element ver=head.addElement("VER");
                Element app=head.addElement("APP");
                Element bCode=head.addElement("BCode");
                Element txid=head.addElement("TXID");
                Element msgId=head.addElement("MsgID");
                Element workDate=head.addElement("WorkDate");
                Element lei=head.addElement("LEI");
            Element msg=fcc.addElement("MSG");
                Element ver1=msg.addElement("VER");
                Element reserved1=msg.addElement("Reserved1");
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1100.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xml_1102(){
        /**
         * 国家/地区基础信息同步确认请求报文
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
            Element head=fcc.addElement("HEAD");
                Element ver=head.addElement("VER");
                Element app=head.addElement("APP");
                Element bCode=head.addElement("BCode");
                Element txid=head.addElement("TXID");
                Element msgId=head.addElement("MsgID");
                Element workDate=head.addElement("WorkDate");
                Element lei=head.addElement("LEI");
            Element msg=fcc.addElement("MSG");
                Element ver1=msg.addElement("VER");
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1102.xml");
        try {
            XMLWriter xmlWriter= new XMLWriter( new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xml_1110(){
        /**
         * 行政区域基础信息同步请求报文（1100）数据项
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
        Element head=fcc.addElement("HEAD");
        Element ver=head.addElement("VER");
        Element app=head.addElement("APP");
        Element bCode=head.addElement("BCode");
        Element txid=head.addElement("TXID");
        Element msgId=head.addElement("WorkDate");
        Element lei=head.addElement("LEI");
        Element msg=fcc.addElement("MSG");
        Element ver1=msg.addElement("VER");
        Element reserved1=msg.addElement("Reserved1");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1110.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void xml_1112() {
        /**
         * 行政区域基础信息同步确认请求报文格式（1112）
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
        Element head=fcc.addElement("HEAD");
        Element ver=head.addElement("VER");
        Element app=head.addElement("APP");
        Element bCode=head.addElement("BCode");
        Element txid=head.addElement("TXID");
        Element msgId=head.addElement("MsgID");
        Element workDate=head.addElement("WorkDate");
        Element lei=head.addElement("LEI");
        Element msg=fcc.addElement("MSG");
        Element ver1=msg.addElement("VER");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1112.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xml_1120(){
        /**
         * 投诉统计分类及编码基础信息同步请求报文格式（1120）数据项
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
        Element head=fcc.addElement("HEAD");
        Element ver=head.addElement("VER");
        Element app=head.addElement("APP");
        Element bCode=head.addElement("BCode");
        Element txid=head.addElement("TXID");
        Element msgId=head.addElement("MsgID");
        Element workDate=head.addElement("WorkDate");
        Element lei=head.addElement("LEI");
        Element msg=fcc.addElement("FCC");
        Element ver1=msg.addElement("VER");
        Element reserved1=msg.addElement("Reserved1");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1120.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.setEscapeText(false);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xml_1122(){
        /**
         * 投诉统计分类及编码基础信息同步确认请求报文格式
         */
        Document document=DocumentHelper.createDocument();
        Element fcc=document.addElement("FCC");
        Element head=fcc.addElement("HEAD");
        Element ver=head.addElement("VER");
        Element app=head.addElement("APP");
        Element bCode=head.addElement("BCode");
        Element txid=head.addElement("TXID");
        Element msgID=head.addElement("MsgID");
        Element workDate=head.addElement("WorkDate");
        Element lei=head.addElement("LEI");
        Element msg=fcc.addElement("MSG");
        Element ver1=msg.addElement("Ver");

        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        File file=new File("xml_1122.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),outputFormat);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void xml_2020(){
        /**
         * 人民银行向商业银行端发布通知公告
         */
        Document document=DocumentHelper.createDocument();
        Element head=document.addElement("HEAD");
        Element ver=head.addElement("VER");
        ver.setText("001");
        Element app=head.addElement("APP");
        app.setText("CCMS");
        Element txid=head.addElement("TXID");
        txid.setText("2020");
        Element bCode=head.addElement("BCode");
        bCode.setText("C1088237000013");
        Element msgID=head.addElement("MsgID");
        msgID.setText("207597441808207872");
        Element workDate=head.addElement("WorkDate");
        workDate.setText("20190702");
        Element lei=head.addElement("LEI");

        Element msg=document.addElement("MSG");
        Element title=msg.addElement("Title");
        title.setText("请上送某数据");
        Element urgent=msg.addElement("Urgent");
        urgent.setText("1");
        Element endTime=msg.addElement("EndTime");
        endTime.setText("20190702115900");
        Element context=msg.addElement("Context");
        context.setText("上送上半年xxx数据");
        Element bName=msg.addElement("BName");
        bName.setText("青岛银行股份有限公司");
        Element sName=msg.addElement("SName");
        sName.setText("青岛银行股份有限公司");
        Element sendTime=msg.addElement("SendTime");
        sendTime.setText("201907021351977");
        Element reserved1=msg.addElement("Reserved1");
        Element reserved2=msg.addElement("Reserved2");
        Element reserved3=msg.addElement("Reserved3");
        Element reserved4=msg.addElement("Reserved4");
        Element reserved5=msg.addElement("Reserved5");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_2020.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void xml_1020(){
        /**
         * 商业银行任务报送
         * 商业银行端回复人民银行端发送的通知公告
         */
        Document document=DocumentHelper.createDocument();
        Element head=document.addElement("HEAD");
        Element ver=head.addElement("VER");
        ver.setText("002");
        Element app=head.addElement("APP");
        app.setText("CCMS");
        Element bCode=head.addElement("BCode");
        bCode.setText("BCode");
        Element txid=head.addElement("TXID");
        txid.setText("1020");
        Element msgId=head.addElement("MsgID");
        msgId.setText("207603686657101824");
        Element workDate=head.addElement("WorkDate");
        workDate.setText("20190702");
        Element lei=head.addElement("LEI");
        Element msg=document.addElement("MSG");
        Element bName=msg.addElement("BName");
        bName.setText("XX银行股份有限公司");
        Element sName=msg.addElement("SName");
        sName.setText("admin");
        Element sendTime=msg.addElement("SendTime");
        sendTime.setText("201907021327159");
        Element context=msg.addElement("Context");
        context.setText("今日事务已经处理");
        Element noticeID=msg.addElement("NoticeID");
        noticeID.setText("206121790739714048");

        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        File file=new File("xml_1020.xml");
        try {
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(file),format);
            xmlWriter.write(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void xml_1022(){
        /**
         * 商业银行端测回已报送任务
         * 商业银行端已向人民银行端报送、对方未查看的任务，商业银行端可以测回。
         */
        Document document=DocumentHelper.createDocument();
        Element head=document.addElement("HEAD");
        Element ver=head.addElement("VER");
        ver.setText("CCMS");
        Element app=head.addElement("APP");
        app.setText("APP");
        Element bCode=head.addElement("BCode");
        bCode.setText("C1088237000013");
        Element txid=head.addElement("TXID");
        txid.setText("1022");
        Element msgID=head.addElement("MsgID");
        msgID.setText("207614791261491200");
        Element workDate=head.addElement("WorkDate");
        Element lei=head.addElement("LEI");
        Element msg=document.addElement("MSG");
        Element bName=msg.addElement("BName");
        bName.setText("XX银行股份有限公司");
        Element sName=msg.addElement("SName");
        sName.setText("admin");
        Element sendTime=msg.addElement("Submission");
        sendTime.setText("2019070221418340");
        Element submissionID=msg.addElement("SubmissionID");
        submissionID.setText("207614811775832064");
    }

}
