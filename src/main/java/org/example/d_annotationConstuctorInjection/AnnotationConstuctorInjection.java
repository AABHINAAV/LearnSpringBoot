package org.example.d_annotationConstuctorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConstuctorInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ControllerClass controllerClass = context.getBean("controllerClass", ControllerClass.class);
        System.out.println(controllerClass.getDataFromServiceClass());
    }
}
