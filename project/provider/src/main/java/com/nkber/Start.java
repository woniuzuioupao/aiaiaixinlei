package com.nkber;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springdubbo.xml");
        context.start();
        //服务继续
        while(true){}
    }
}
