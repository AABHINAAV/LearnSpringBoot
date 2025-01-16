package org.example.e_bean_annotation;

import org.example.e_bean_annotation.a_field_injection.ControllerClass_field_injection;
import org.example.e_bean_annotation.b_constructor_injection.ControllerClass_constructor_injection;
import org.example.e_bean_annotation.c_setter_injection.ControllerClass_setter_injection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurationClass.class);

        // using bean factory instead of application context
//        BeanFactory beanFactory = new AnnotationConfigApplicationContext(BeansConfigurationClass.class);
//        ControllerClass_field_injection controllerClass_field_injection = beanFactory.getBean(ControllerClass_field_injection.class);
//        controllerClass_field_injection.callMethodFromFieldAutoWiring();

        ControllerClass_field_injection controllerClass_field_injection = context.getBean(ControllerClass_field_injection.class);
        controllerClass_field_injection.callMethodFromFieldAutoWiring();

        ControllerClass_setter_injection controllerClassSetterInjection = context.getBean(ControllerClass_setter_injection.class);
        controllerClassSetterInjection.callMethodFromSetterAutoWiring();

        ControllerClass_constructor_injection controllerClassConstructorInjection = context.getBean(ControllerClass_constructor_injection.class);
        controllerClassConstructorInjection.callMethodFromConstructorAutoWiring();
    }
}
