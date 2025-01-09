package org.example.e_bean_annotation.c_setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass_setter_injection {

    private ServiceClass_setter_injection serviceClass;

    @Autowired
    public void setServiceClass(ServiceClass_setter_injection serviceClass) {
        this.serviceClass = serviceClass;
    }

    public void callMethodFromSetterAutoWiring() {
        System.out.println(serviceClass.getData());
    }
}
