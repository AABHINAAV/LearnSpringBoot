package org.example.b_learnSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnSetterInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        BeanCreation_Xml_setterInjection setterBasedBean = context.getBean("beanCreationXmlSetterInjection", BeanCreation_Xml_setterInjection.class);
        System.out.println(setterBasedBean.getDataFromService());
    }
}
