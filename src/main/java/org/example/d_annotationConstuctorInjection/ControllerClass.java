package org.example.d_annotationConstuctorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass {
    private ServiceClass serviceClass;

    @Autowired
    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getDataFromServiceClass() {
        return this.serviceClass.getData();
    }
}
