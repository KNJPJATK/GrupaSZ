package com.example.beans;

import org.springframework.stereotype.Component;

import java.util.Date;



@Component
public class AnnotationBean {

    protected String name;
    protected Date date;

    public AnnotationBean(String name) {
        this.name = name;
        this.date = new Date();
    }

    public AnnotationBean() {
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "XmlBean{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
