package com.minis;

import com.minis.beans.BeansException;
import com.minis.context.ClassPathXmlApplicationContext;
import com.minis.core.ClassPathXmlResource;
import com.minis.test.AService;

public class Test1 {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService) ctx.getBean("aservice");
        aService.sayHello();
    }
}
