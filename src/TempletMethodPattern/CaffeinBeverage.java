package TempletMethodPattern;

public abstract class CaffeinBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();
    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("물을 끓이고 있습니다 ..");
    }
    public void pourInCup() {
        System.out.println("컵에 물을 붓고 있습니다 .. ");
    }

}
