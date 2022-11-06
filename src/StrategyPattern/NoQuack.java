package StrategyPattern;

public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("소리를 못냅니다");
    }
}
