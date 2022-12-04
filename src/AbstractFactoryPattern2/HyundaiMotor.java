package AbstractFactoryPattern2;

import com.sun.javafx.scene.traversal.Direction;

public class HyundaiMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai motor");
}
}
