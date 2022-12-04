package TempletMethodPattern;

public class Tea extends CaffeinBeverage{

    @Override
    public void brew() {
        System.out.println("홍차를 우려내는중 ..");
    }

    @Override
    public void addCondiments() {
        System.out.println("래몬을 추가하는중 .. ");
    }
}
