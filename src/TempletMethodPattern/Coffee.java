package TempletMethodPattern;

public class Coffee extends CaffeinBeverage {

    @Override
    public void brew() {
        System.out.println("커피를 우려내는중 ..");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는중 ..");
    }
}
