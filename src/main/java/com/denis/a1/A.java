package com.denis.a1;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A implements ApplicationContextAware {

    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        if (arg0 != null) {
            ctx=arg0;
        }
    }

    public synchronized static ApplicationContext getApplicationContext(){
        if (ctx==null) {
            ctx = new ClassPathXmlApplicationContext("SpringModule.xml");
        }
        return ctx;
    }

}