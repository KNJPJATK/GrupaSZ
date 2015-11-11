package com.example.autowired;

import com.example.beans.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class InjectBean {

    @Autowired
    private SimpleBean firstConfigSimpleBean;

    @Autowired
    // gdy zakomentujemy "@Qualifier" dostaniemy komunikat:
    // No qualifying bean of type [com.example.beans.SimpleBean]
    // is defined: expected single matching bean but found 6:
    // firstBean,secondBean,thirdBean,firstConfigSimpleBean,
    // secondConfigSimpleBean,thirdConfigSimpleBeanWithCustomName
    @Qualifier(value = "secondConfigSimpleBean")
    private SimpleBean simpleBean;


    @Override
    public String toString() {
        return "InjectBean{" +
                "\nfirstConfigSimpleBean=" + firstConfigSimpleBean +
                "\nsimpleBean=" + simpleBean +
                "\n}";
    }
}
