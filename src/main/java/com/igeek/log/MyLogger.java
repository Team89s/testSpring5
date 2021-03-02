package com.igeek.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/3/2 9:38
 */
public class MyLogger {

    //自定义日志器
    private static final Logger logger = LoggerFactory.getLogger(MyLogger.class);

    public static void main(String[] args) {
        //info级别
        logger.info("MyLogger info级别");
        //warn级别
        logger.warn("MyLogger warn级别");
    }

}
