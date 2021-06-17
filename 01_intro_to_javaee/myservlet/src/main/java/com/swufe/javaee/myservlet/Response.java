package com.swufe.javaee.myservlet;



import java.nio.channels.SelectionKey;


/**
 * ClassName:    Response
 * Package:    com.swufe.javaee.myservlet
 * Description:
 */
public interface Response {

    //服务器名字
//    public static final String SERVER_NAME = XMLUtil.getRootElement("\\server.xml").element("serverName").getText();
    public static final String SERVER_NAME ="Java NIO Server";

    public String getContentType();

    public int getStatuCode();

    public String getStatuCodeStr();

    public String getHtmlFile();

    public void setHtmlFile(String htmlFile);

    public SelectionKey getKey();

    public void setContentType(String contentType);

    public void setStatuCode(int statuCode);

    public void setStatuCodeStr(String statuCodeStr);
}