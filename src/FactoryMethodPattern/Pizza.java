package FactoryMethodPattern;

public abstract class Pizza {
    String pizza_name;
    public void prepare() {
        System.out.println("피자 도우 , 밀가루 , 재료를 준비중");
    }
    public void bake() {
        System.out.println("피자를 굽는중");
    }
    public void cut() {
        System.out.println("피자를 자르는중");

    }
    public void box() {
        System.out.println("피자를 박스에 담는중 ");
    }
    public String getName() {
        return pizza_name;
    }
}

