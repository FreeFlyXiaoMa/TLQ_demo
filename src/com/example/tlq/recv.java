package com.example.tlq;

//import com.tongtech.tlq.base.TlqConnContext;
//import com.tongtech.tlq.base.TlqConnection;
import com.tongtech.tlq.base.*;
public class recv {
    public static void main(String[] argv) throws Exception{
        TlqConnContext conncontext=new TlqConnContext();
        conncontext.HostName="39.97.217.158";
        conncontext.ListenPort= Integer.parseInt("10003");
        TlqConnection conn=new TlqConnection(conncontext);
        TlqQCU tlqQCU=conn.openQCU();
        /**create a message forget */
        TlqMessage msg=new TlqMessage();
        msg.MsgType= (char) msg.BUF_MSG;
        /**create msgOption for get */
        TlqMsgOpt msgopt=new TlqMsgOpt();
        msgopt.QueName=new String("sq");
        msgopt.MatchOption=msgopt. TLQMATCH_MSGTYPE;
        tlqQCU.getMessage(msg, msgopt);
        int value=msg.getIntProperty("int");
        byte[] msgData=msg.getMsgData();
        process(msgData);
        tlqQCU.close();
        conn.close();
    }
    private static void process(byte[] data)
    {
        System.out.println("接收到消息："+new String(data));
    }

}
