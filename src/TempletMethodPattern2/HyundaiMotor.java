package TempletMethodPattern2;

import com.sun.javafx.scene.traversal.Direction;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door) ;
    }
    protected void moveMotor(Direction direction) {
        // Hyundai Motor를 구동시킨다.
        System.out.println("move");
    }
}


