package org.example.a_learnConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnConstructorInjection {
    public static void getBeanByXmlFile() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        BeanCreation_Xml_constructorInjection xmlBasedBean = context.getBean("beanCreationXmlConstructorInjection", BeanCreation_Xml_constructorInjection.class);
        System.out.println(xmlBasedBean.getTypeForBeanGeneration());
        System.out.println(xmlBasedBean.getDataFromDI());
    }

    public static void main(String[] args) {
        getBeanByXmlFile();
    }
}