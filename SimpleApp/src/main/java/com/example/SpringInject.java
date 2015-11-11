package com.example;

import com.example.autowired.InjectBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringInject {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("\n\n-------------------------------------------------------------------------------\n\n");


        InjectBean injectBean = (InjectBean) context.getBean("injectBean");
        System.out.println(injectBean);


    }
}
