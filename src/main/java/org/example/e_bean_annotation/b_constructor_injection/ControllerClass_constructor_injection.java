package org.example.e_bean_annotation.b_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass_constructor_injection {

    private ServiceClass_constructor_injection serviceClass;

    public ControllerClass_constructor_injection() {
    }

    @Autowired
    public ControllerClass_constructor_injection(ServiceClass_constructor_injection serviceClass) {
        this.serviceClass = serviceClass;
    }

    public void callMethodFromConstructorAutoWiring() {
        System.out.println(serviceClass.getData());
    }
}
