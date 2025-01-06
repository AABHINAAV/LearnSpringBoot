package org.example.d_annotationBasedDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass {
    public String getData() {
        return "Data from Annotation-based DI by Constructor";
    }
}
