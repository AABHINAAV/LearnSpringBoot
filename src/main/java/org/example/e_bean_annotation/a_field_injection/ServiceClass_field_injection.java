package org.example.e_bean_annotation.a_field_injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass_field_injection {
    public String getData() {
        return "Data from Bean Annotation using field injection";
    }

    public void initMethodFieldInjection() {
        System.out.println("initMethod called before bean creation of ServiceClass_field_injection");
    }

    public void destroyMethodFieldInjection() {
        System.out.println("destroyMethod called after bean destruction of ServiceClass_field_injection");
    }
}
