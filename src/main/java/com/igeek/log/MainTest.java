package com.igeek.log;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/3/2 9:29
 */
public class MainTest {

    @Test
    public void testPerson(){
        //创建IOC容器对象 ， 需要提供一个配置类的类类型
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);

        //获取实例
        Person person = ac.getBean(Person.class);
        System.out.println(person);

        //int i = 10/0;
    }

}
