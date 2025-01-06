package org.example.a_learnConstructorInjection;

public class BeanCreation_Xml_constructorInjection {

    private ConstuctorInjectionService constuctorInjectionService;

    public BeanCreation_Xml_constructorInjection(ConstuctorInjectionService xmlBasedDIByConstructor) {
        this.constuctorInjectionService = xmlBasedDIByConstructor;
    }

    public String getTypeForBeanGeneration() {
        return "Generation Bean By XML File in IOC";
    }

    public String getDataFromDI() {
        return constuctorInjectionService.getData();
    }
}
