package StrategyPattern;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날고 있습니다");
    }
}

