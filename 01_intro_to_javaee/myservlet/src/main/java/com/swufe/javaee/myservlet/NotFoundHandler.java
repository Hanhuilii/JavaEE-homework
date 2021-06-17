package com.swufe.javaee.myservlet;



import org.apache.log4j.Logger;


/**
 * ClassName:    NotFoundHandler
 * Package:    com.swufe.javaee.myservlet
 * Description:
 */
public class NotFoundHandler extends AbstractHandler {

    private Logger logger = Logger.getLogger(NotFoundHandler.class);
    private Response response;

    @Override
    public void doGet(Context context) {
        logger.info("进入了404Handler");
        response = context.getResponse();

        response.setStatuCode(404);
        response.setStatuCodeStr("Not Found");
        String path = this.getClass().getClassLoader().getResource("404.html").getPath();
        response.setHtmlFile(path);
    }
}
