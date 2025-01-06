package org.example.b_learnSetterInjection;

public class BeanCreation_Xml_setterInjection {
    private SetterInjectionService setterInjectionService;

    public void setSetterInjectionService(SetterInjectionService setterInjectionService) {
        this.setterInjectionService = setterInjectionService;
    }

    public String getDataFromService() {
        return this.setterInjectionService.getData();
    }
}
