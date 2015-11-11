package com.example.configuration;

import com.example.beans.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.company")
public class ConfigBeans {

    @Bean
    public String stringConfigString() {
        return new String("String też może być bean'em");
    }

    @Bean
    public SimpleBean firstConfigSimpleBean() {
        return new SimpleBean("ConfigBeans - pierwszy bean");
    }

    @Bean
    public SimpleBean secondConfigSimpleBean() {
        return new SimpleBean("ConfigBeans - drugi bean");
    }

    @Bean(name = "thirdConfigSimpleBeanWithCustomName")
    public SimpleBean thirdConfigClassBean() {
        return new SimpleBean("ConfigBeans - trzeci bean, ktorej identyfikator jest definiowany w adnotacji");
    }


}
