package com.swufe.javaee.myservlet;



import java.nio.channels.SelectionKey;

/**
 * ClassName:    Context
 * Package:    com.swufe.javaee.myservlet
 * Description:
 */
public abstract class Context {

    protected Request request;
    protected Response response;

    /**
     * 设置当前连接的上下文
     * @param:  @return
     * @return: Context
     * @Autor: Han
     */
    public abstract void setContext(String requestHeader, SelectionKey key);

    /**
     * 得到Request
     * @param:  @return
     * @return: Request
     * @Autor: Han
     */
    public Request getRequest() {
        return request;
    }

    /**
     * 得到Response
     * @param:  @return
     * @return: Response
     * @Autor: Han
     */
    public Response getResponse() {
        return response;
    }

}
