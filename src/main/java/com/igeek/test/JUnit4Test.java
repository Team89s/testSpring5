package com.igeek.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//JUnit4版本
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JUnit4Test {

    //自动装配
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
