package com.swufe.javaee.myservlet;



import org.apache.log4j.Logger;


/**
 * ClassName:    LogionHandler
 * Package:    com.swufe.javaee.myservlet
 * Description:
 */
public class LogionHandler extends AbstractHandler{

    private Logger logger = Logger.getLogger(LogionHandler.class);

    @Override
    public void doGet(Context context) {
        logger.info("进入了handler--->LoginHandler");
        String path = this.getClass().getClassLoader().getResource("login.html").getPath();
        context.getResponse().setStatuCode(200);
        context.getResponse().setHtmlFile(path);
    }
}
