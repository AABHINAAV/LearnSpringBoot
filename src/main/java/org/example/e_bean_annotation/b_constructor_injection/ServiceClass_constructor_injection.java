package org.example.e_bean_annotation.b_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass_constructor_injection {
    public String getData() {
        return "Data from Bean Annotation using constructor injection";
    }
}
