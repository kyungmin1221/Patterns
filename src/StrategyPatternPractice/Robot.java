package StrategyPatternPractice;

public abstract class Robot {

//    private String name;
//    MovingStrategy movingStrategy;
//    AttackStrategy attackStrategy;
//
//    public abstract void display();
//
//    public Robot(String name) {
//        this.name = name;
//    }
//    public String getName(String name) {
//        return name;
//    }
//    public void move() {
//
//    }
//    public void attak() {
//
//    }
//   public void setmove(MovingStrategy movingStrategy) {
//        this.movingStrategy = movingStrategy;
//   }
//   public void setattack(AttackStrategy attackStrategy){
//        this.attackStrategy = attackStrategy;
//   }
private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
    public void move(){
        this.movingStrategy.move();
    }
    public void attack(){
        this.attackStrategy.attack();
    }
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
