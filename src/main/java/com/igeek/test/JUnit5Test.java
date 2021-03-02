package com.igeek.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//JUnit5
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:spring.xml")

//JUnit5提供一个复合注解
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class JUnit5Test {

    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
