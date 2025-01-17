package org.example.e_bean_annotation;

import org.example.e_bean_annotation.a_field_injection.ControllerClass_field_injection;
import org.example.e_bean_annotation.a_field_injection.ServiceClass_field_injection;
import org.example.e_bean_annotation.b_constructor_injection.ControllerClass_constructor_injection;
import org.example.e_bean_annotation.b_constructor_injection.ServiceClass_constructor_injection;
import org.example.e_bean_annotation.c_setter_injection.ControllerClass_setter_injection;
import org.example.e_bean_annotation.c_setter_injection.ServiceClass_setter_injection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfigurationClass {
    @Bean
    @Scope("singleton") // default value // A single instance of the bean is created and shared across the entire application
    public ControllerClass_field_injection controllerClassFieldInjection() {
        return new ControllerClass_field_injection();
    }

    @Bean(initMethod = "initMethodFieldInjection", destroyMethod = "destroyMethodFieldInjection")
    @Scope("prototype") // A new instance of the bean is created each time it is requested.
    public ServiceClass_field_injection serviceClassFieldInjection() {
        return new ServiceClass_field_injection();
    }

    @Bean
    public ControllerClass_constructor_injection controllerClassConstructorInjection() {
        return new ControllerClass_constructor_injection(serviceClassConstructorInjection());
    }

    @Bean
    public ServiceClass_constructor_injection serviceClassConstructorInjection () {
        return new ServiceClass_constructor_injection();
    }


    @Bean
    public ControllerClass_setter_injection controllerClassSetterInjection() {
        return new ControllerClass_setter_injection();
    }

    @Bean
    public ServiceClass_setter_injection serviceClassSetterInjection() {
        return new ServiceClass_setter_injection();
    }
}
