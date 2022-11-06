package StrategyPatternPractice;

public class Robotgame {
    public static void main(String[] args) {
        Robot r1 = new TaekwonV("yujin1");
        Robot r2 = new Atom("yujin2");
       // FlyingStrategy

        System.out.println(r1.getName());
        r1.setAttackStrategy(new MissileStrategy());
        r1.setMovingStrategy(new WalkingStrategy());
        r1.move();
        r1.attack();

        System.out.println(r2.getName());
        r2.setMovingStrategy(new FlyingStrategy());
        r2.setAttackStrategy(new PunchStrategy());
        r2.move();
        r2.attack();


    }
}
