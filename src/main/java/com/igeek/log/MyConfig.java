package com.igeek.log;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Description JAVA类完成bean的配置
 * @Author chenmin
 * @Date 2021/3/2 9:28
 */
@Configuration
//添加扫描包，让指定包下的注解生效
@ComponentScan(basePackages = {"com.igeek.log"})
public class MyConfig {

    //@Bean  --->  SpringBoot

}
