package org.example.c_literalInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnLiteralInjection {
    private String carName;
    private double price;
    private String brandName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        LearnLiteralInjection obj = context.getBean("learnLiteralInjection", LearnLiteralInjection.class);
        System.out.println("Car Name: " + obj.getCarName());
        System.out.println("Price: " + obj.getPrice());
        System.out.println("Brand Name: " + obj.getBrandName());
    }
}
