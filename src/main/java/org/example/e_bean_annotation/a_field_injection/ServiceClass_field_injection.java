package org.example.e_bean_annotation.a_field_injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass_field_injection {
    public String getData() {
        return "Data from Bean Annotation using field injection";
    }
}
