package org.example.d_annotationBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass {

    @Autowired
    private ServiceClass serviceClass;

//    @Autowired
//    public ControllerClass(ServiceClass serviceClass) {
//        this.serviceClass = serviceClass;
//    }

//    @Autowired
//    public void setServiceClass(ServiceClass serviceClass) {
//        this.serviceClass = serviceClass;
//    }

    public String getDataFromServiceClass() {
        return this.serviceClass.getData();
    }
}
