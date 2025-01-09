package org.example.e_bean_annotation.c_setter_injection;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass_setter_injection {

    public String getData() {
        return "Data from Bean Annotation using setter injection";
    }
}
