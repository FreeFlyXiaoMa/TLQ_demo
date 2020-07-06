package com.example.tlq;
import com.tongtech.tlq.base.*;
//import com.tongtech.jndi.protocol.
public class send {

    public static void main(String[] argv) throws Exception{
        TlqConnContext conncontext=new TlqConnContext();
        conncontext.HostName="127.0.0.1";
        conncontext.ListenPort= Integer.parseInt("10252");

        TlqConnection conn=new TlqConnection(conncontext);

        TlqQCU tlqQCU=conn.openQCU("qcu1");

        /**create a message for put */
        TlqMessage msg=new TlqMessage();
        msg.MsgType= (char) msg.BUF_MSG;
        byte[] msgData=new byte[100];
        for(int i=0;i<100;i++)
            msgData[i]= Byte.parseByte("a");
        msg.setMsgData(msgData);
        msg.MsgSize=100;
        msg.setIntProperty("int",10);
        /**create msgOption for put */
        TlqMsgOpt msgopt=new TlqMsgOpt();
        msgopt.QueName=new String("lq");

        msgopt.OperateType=msgopt.TLQOT_PUT;
        tlqQCU.putMessage(msg,msgopt);
        tlqQCU.close();
        conn.close();

    }

}
