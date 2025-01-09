package org.example.e_bean_annotation.a_field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerClass_field_injection {

    @Autowired
    private ServiceClass_field_injection serviceClass;

    public void callMethodFromFieldAutoWiring() {
        System.out.println(serviceClass.getData());
    }
}
