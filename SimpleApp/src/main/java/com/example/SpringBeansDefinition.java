package com.example;

import com.example.beans.AnnotationBean;
import com.example.beans.SimpleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansDefinition {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("\n\n-------------------------------------------------------------------------------\n\n");
        // Bean'y zdefiniowane w pliku XML
        SimpleBean simpleBean = (SimpleBean) context.getBean("firstBean");
        System.out.println(simpleBean);

        SimpleBean secondBean = (SimpleBean) context.getBean("secondBean");
        System.out.println(secondBean);

        SimpleBean thirdBean = (SimpleBean) context.getBean("thirdBean");
        System.out.println(thirdBean);

        SimpleBean duplicatedthirdBean = (SimpleBean) context.getBean("thirdBean");
        System.out.println(duplicatedthirdBean);

        System.out.println();

        // Bean'y zdefiniowane w klasie z
        SimpleBean firstConfigSimpleBean = (SimpleBean) context.getBean("firstConfigSimpleBean");
        System.out.println(firstConfigSimpleBean);

        SimpleBean secondConfigSimpleBean = (SimpleBean) context.getBean("secondConfigSimpleBean");
        System.out.println(secondConfigSimpleBean);

        SimpleBean thirdConfigSimpleBeanWithCustomName = (SimpleBean) context.getBean("thirdConfigSimpleBeanWithCustomName");
        System.out.println(thirdConfigSimpleBeanWithCustomName);

        String stringConfigSimpleBean = (String) context.getBean("stringConfigString");
        System.out.println(stringConfigSimpleBean);

        System.out.println();

        //Konfiguracja przy użyciu adnotacji
        AnnotationBean annotationBean = (AnnotationBean) context.getBean("annotationBean");
        System.out.println(annotationBean);

        // Wszystkie dostępne bean'y
        System.out.println("\n\n-------------------------------------------------------------------------------\n\n");
        System.out.println("Wszystkie dostępne bean'y");
        String[] beans = context.getBeanDefinitionNames();

        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
