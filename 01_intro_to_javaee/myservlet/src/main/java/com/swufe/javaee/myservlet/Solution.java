package com.swufe.javaee.myservlet;


import java.io.File;
import java.io.IOException;

/**
 * ClassName:    Solution
 * Package:    com.swufe.javaee.myservlet
 * Description: 启动Web服务器入口
 */

public class Solution {

    //启动方法
    public static void main(String[] args) {
        new Thread(new Server(false)).start();
    }
}