package StrategyPatternPractice;

public class PunchStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("펀치 중입니다");
    }
}
