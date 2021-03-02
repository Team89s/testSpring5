package com.igeek.generic;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/3/2 10:23
 */
public class MainTest {

    @Test
    public void test(){

        //GenericApplicationContext  函数式编程的核心容器
        GenericApplicationContext ac = new GenericApplicationContext();

        //刷新容器
        ac.refresh();
        //注册bean实例
        ac.registerBean("user123",User.class,() -> new User());

        //获得实例bean
        //User user = ac.getBean(User.class);
        //User user = (User) ac.getBean("com.igeek.generic.User");
        User user = (User) ac.getBean("user123");
        System.out.println(user);
    }

}
