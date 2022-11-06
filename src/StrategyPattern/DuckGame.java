package StrategyPattern;

public class DuckGame {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();

        mallard.getQuackBehavior();
        mallard.getFlyBehavior();

        System.out.println();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.getQuackBehavior();
        mallard.getFlyBehavior();

        System.out.println();

        mallard.setQuackBehavior(new NoQuack());
        mallard.getQuackBehavior();
        mallard.getFlyBehavior();


    }
}
