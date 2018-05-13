package com.nkber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    @Autowired
    private SayHi sayHi;

    public SayHi getSayHi() {
        return sayHi;
    }

    public void setSayHi(SayHi sayHi) {
        this.sayHi = sayHi;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springdubbo.xml");
        SayHi sayHi=(SayHi) context.getBean("sayHi");
        System.out.println(sayHi.sayHi("hanyan"));

    }
}
