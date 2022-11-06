package StrategyPatternPractice;

public class FlyingStrategy implements MovingStrategy{
    @Override
    public void move() {
        System.out.println("나는 중입니다");
    }
}
