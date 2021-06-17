package com.swufe.javaee.myservlet;



import java.nio.channels.SelectionKey;


/**
 * ClassName:    HttpContext
 * Package:    com.swufe.javaee.myservlet
 * Description:
 */
public class HttpContext extends Context {

    private Request request;
    private Response response;

    @Override
    public void setContext(String requestHeader, SelectionKey key) {

        //初始化request
        request = new HttpRequest(requestHeader);
        //初始化response
        response = new HttpResponse(key);
        setRequest();
        setResponse();
    }

    private void setRequest() {
        super.request = this.request;
    }

    private void setResponse() {
        super.response = this.response;
    }
}
